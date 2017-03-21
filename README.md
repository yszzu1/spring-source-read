# spring-source-read



spring4默认在启动时自动初始化bean (单例的，而且没有配置懒加载)，而不是在getBean的时候才去new  
如果A依赖B （b是a的一个属性）， 先初始化A, 不是先初始化B

