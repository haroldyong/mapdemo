# 验证Map的三种循环效率

# 过程

## 分别使用
  for (Map.Entry<String, Object> each : myMap.entrySet())

  Iterator it = myMap.entrySet().iterator();
 
  Iterator keyIt = myMap.keySet().iterator();
  
  这三种方式去读取 不同size的Map对象，看每次执行的时间比例
 
# 结论

keySet少用，其他随缘
 
