# spring-source-read



spring4默认在启动时自动初始化bean (单例的，而且没有配置懒加载)，而不是在getBean的时候才去new  
如果A依赖B （b是a的一个属性）， 先创建A的实例, 之后在populatebean的时候检查autowired属性进行依赖bean的创建，不是先初始化B  
如果A设置有dependon属性，会在创建A的实例之前先创建dependon的bean实例  
