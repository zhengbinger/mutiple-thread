# 多线程
## 相关概念
1. 并发,通过多个执行器同时执行一个大任务来缩短执行时间、提高执行效率的方法。
2. 数据竞争，对一个共享数据本应独占的读取、检查、修改过程发生了并发的情况。
3. 临界区，存在数据竞争的代码片段。
4. 互斥锁（也可以简称为“锁”），同一时间只能由一个执行器获取的实体，用于实现对临界区的互斥（只有一个）访问。
5. 分布式，通过多台计算机完成同一任务的方式。
6. 集群，一组完成同一任务的机器。
7. 分布式锁，在不同机器/进程上提供互斥能力的锁。
8. 数据不一致，一系列操作不具有原子性，一部分执行成功而另一部分没有，导致不同数据之间存在矛盾，例如订单已经是发货状态，但是实际没有发货。
9. 兜底任务，处理数据不一致状态的任务。
10. 最终一致性，通过兜底任务或其他方式保证数据不一致的情况最终会消失。
11. map-reduce，一种任务拆分-执行-再合并的任务执行方式，可以有效地利用多台机器、多核CPU的性能。

### 内存可见性问题
线程对共享变量的修改，能够及时的被其他线程看到

## 线程池
### 核心参数
#### 核心线程数
#### 最大执行时间
#### 最大执行时间单位
TimeUnit
#### 队列

### 线程池分类
####
####
####
####

