1.作业:Autowired与Resource的区别,
    @Autowired默认按类型装配（这个注解是属业spring的），
    默认情况下必须要求依赖对象必须存在，如果要允许null值，
    可以设置它的required属性为false，如：@Autowired(required=false) ，
    如果我们想使用名称装配可以结合@Qualifier注解进行使用，如下：
     @Autowired()@Qualifier("baseDao")
    privateBaseDao baseDao;
    
    
    @Resource（这个注解属于J2EE的），默认按照名称进行装配，
    名称可以通过name属性进行指定，如果没有指定name属性，
    当注解写在字段上时，默认取字段名进行安装名称查找，
    如果注解写在setter方法上默认取属性名进行装配。
    当找不到与名称匹配的bean时才按照类型进行装配。
    但是需要注意的是，如果name属性一旦指定，就只会按照名称进行装配。
  @Resource(name="baseDao")
    privateBaseDao baseDao;
 2.添加4个注解时,默认bean的名字是什么?如何改变
    
    取短类名，即不包含包路径的类名，例如com.test.Student的短类名为Student，
    这点跟XML配置中取全类名不一样
    
    如果短类名长度大于1，且第一个和第二个字符为大写，则直接返回短类名，
    也就是说假设类为com.test.STudent，则beanName为STudent
    
    其他情况下将短类名首字符小写后返回，假设类为com.test.Student，
    则beanName为student
    
    
    返回类名，首字母小写  values控制名字
 3.做好笔记
 
 4 @Value注解除了修饰在字段上,还可以修饰在哪里?
  1、基本数值直接赋值
     2、可以写SpEL：#{}表达式通过运算进行赋值
     3、可以写${}；取出配置文件【xxx.properties】中的值（在运行环境变量里面的值）
     进行赋值
 5.Autowired注解的required属性是什么意思?
    在使用spring开发过程中，我们基本上都是使用@Autowired这个注解，
    用来注入已有的bean。但是有些时候，会注入失败。
    当我们加上参数（required=false）就能解决
    
    @Autowired(required=true)：当使用@Autowired注解的时候，
    其实默认就是@Autowired(required=true)，表示注入的时候，
    该bean必须存在，否则就会注入失败。
    
    @Autowired(required=false)：表示忽略当前要注入的bean，
    如果有直接注入，没有跳过，不会报错
 6.Autowired注解可以修饰在哪里?
    字段、参数、构造函数、方法
 7.怎么读取多个外部属性文件
    1、*.文件名
    2、多写几次