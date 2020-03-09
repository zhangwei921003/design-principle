package com.panda.study.design.pattern.proxy.my;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class MyProxy {

  protected MyInvocationHandler h;

  public MyProxy(MyInvocationHandler h) {
    this.h = h;
  }

  public static Object newProxyInstance(MyClassLoader loader,
      Class<?>[] interfaces,
      MyInvocationHandler h)
      throws IllegalArgumentException {

    try {
      //Step1:动态生成.java文件
      String src = generatorSrc(interfaces);
      System.out.println(src);
      //Step2:将.java文件输入到磁盘
      String filePath = MyProxy.class.getResource("").getPath() + "$Proxy0.java";
      Files.write(Paths.get(filePath), src.getBytes());
      //Step3:把生成的.java 文件编译成.class 文件
      JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
      StandardJavaFileManager manage = compiler.getStandardFileManager(null, null, null);
      Iterable iterable = manage.getJavaFileObjects(new File(filePath));
      JavaCompiler.CompilationTask task = compiler.getTask(null, manage, null, null, null, iterable);
      task.call();
      manage.close();
      //Step4:把编译生成的.class 文件加载到 JVM 中
      Class proxyClass = loader.findClass("$Proxy0");
      Constructor c = proxyClass.getConstructor(MyInvocationHandler.class);
      //Step5:返回字节码重组以后的新的代理对象
      return c.newInstance(h);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

  private static String generatorSrc(Class<?>[] interfaces) {
    StringBuffer sb = new StringBuffer();

    sb.append("package com.panda.study.design.pattern.proxy.my;\n"
        + "import java.lang.reflect.*;\n");
    sb.append("public final class $Proxy0 extends MyProxy implements " + interfaces[0].getSimpleName() + "{ \n");
    sb.append("  public $Proxy0(MyInvocationHandler var1) {\n"
        + "    super(var1);\n"
        + "  }\n");
    for (Method m : interfaces[0].getMethods()) {
      Class<?>[] params = m.getParameterTypes();
      StringBuffer paramNames = new StringBuffer();
      StringBuffer paramValues = new StringBuffer();
      StringBuffer paramClasses = new StringBuffer();
      for (int i = 0; i < params.length; i++) {
        Class clazz = params[i];
        String type = clazz.getSimpleName();
        String paramName = "var" + i;
        paramNames.append(type + " " + paramName);
        paramValues.append(paramName);
        paramClasses.append(clazz.getSimpleName() + ".class");
        if (params.length > 1 && i < params.length - 1) {
          paramNames.append(",");
          paramClasses.append(",");
          paramValues.append(",");
        }
      }

      sb.append("public final " + m.getReturnType().getSimpleName() + " " + m.getName() + "(" + paramNames.toString() + ") {\n"
          + "    try {\n"
          + "      Method m = " + interfaces[0].getSimpleName() + ".class.getMethod (\"" + m.getName() + "\",new Class[]{" + paramClasses.toString()
          + "});\n"
          + (hasReturnValue(m.getReturnType()) ? "return " : "")
          + getCaseCode("super.h.invoke(this,m,new Object[]{" + paramValues + "})", m.getReturnType()) + ";\n"
          + "    } catch (RuntimeException | Error var2) {\n"
          + "      throw var2;\n"
          + "    } catch (Throwable var3) {\n"
          + "      throw new UndeclaredThrowableException(var3);\n"
          + "    }\n"
          + "  }\n");
    }
    sb.append("}\n");
    return sb.toString();
  }

  private static Map<Class, Class> mappings = new HashMap();

  static {
    mappings.put(int.class, Integer.class);
    mappings.put(Integer.class, Integer.class);
    mappings.put(String.class, String.class);
    mappings.put(Boolean.class, Boolean.class);
    mappings.put(boolean.class, Boolean.class);
  }

  private static String getCaseCode(String code, Class<?> returnClass) {
    if (mappings.containsKey(returnClass)) {
      return "((" + mappings.get(returnClass).getSimpleName() + ")" + code + ")";
    }
    return code;
  }

  private static boolean hasReturnValue(Class<?> clazz) {
    return clazz != void.class;
  }
}
