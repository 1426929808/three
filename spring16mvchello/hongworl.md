1.不加controller注解出现什么问题？
会报404找不到错误
2.controller注解换为Component注解是什么情况
会报404找不到错误
3.RequestMapping注解写为@RequestMapping("") 和@RequestMapping("/")各是什么情况
@RequestMapping("") 写了这个注解，会找不到，另一个写了的找得到
                    tomcat可以跑（8080jsp页面也可以显示，index界面现实不了）
                    
@RequestMapping("/") 两个都写成（"/"）会报500错误Servlet.init() for servlet [hello] threw exception
                  单个方法时=  modelandview改成/则会将消息直接显示在8080页面，访问是会返回8080页面
                  优先会以带/的方法先执行
4.InternalResourceViewResolver删掉，直接在控制器类的方法里面写死地址，比如return "WEB-INF/jsp/hello.jsp出现什么情况
8080：404错误
index：可以访问到jsp
index2：404错误
路径写对就可以找到
5.InternalResourceViewResolver去掉前缀与后缀的配置或者只配前缀或只配后缀情况怎么样？？
全部去掉：都报404错误
去掉前缀：都报404错误
去掉后缀：都报404错误（）
6.控制器类的方法名字可以任意吗？
可以
7.控制器类的方法可以是静态的吗？
可以
8.控制器类的方法可以返回任意类型吗？比如返回你自己写的一个类
不可以
@RequestMapping("index3")
    public Integer test(){
        return 6666;
    }
500错误 Request processing failed; nested exception is java.lang.IllegalArgumentException: Unknown return value type: java.lang.Integer
9.在jsp页面里面遍历输出请求作用域所有的attribute，看看里面有什么？
10.ModelAndView类的数据放到哪里了？为什么jsp里写el表达式可以取出来？
11.既然创建出了一个spring容器，如何获取这个容器呢？
@Autowired
public ApplicationContext xxxx();
12.如果能获取到这个spring容器，容器里面都有多少管理的bean？
输出这些bean的名字
context.getbeandefinitionnames
13. 如果把DispatcherServlet的url-pattern配置为*.html,
那么访问地址为hello.html的时候RequestMapping注解的值应该
写成什么才能访问到这个请求处理方法?