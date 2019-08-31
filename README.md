#스트림 - Stream
---
스트림은 자바 8부터 추가된 컬렉션의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자이다.

---
**반복자 스트림**<br>

기존 List에서 요소를 하나씩 찍는 방법
```java
List<String> list = Arrays.asList("a","b","c");

Iterator<String> iterator = list.iterator();

while(iterator.hasNext()) {
    String name = iterator.next();
    System.out.println(name);
}

```

자바8의 Stream을 사용해서 요소를 찍는 방법
```java
List<String> list = Arrays.asList("a","b","c");

Stream<String> stream = list.stream();

stream.forEach( name -> System.out.println(name));
```
