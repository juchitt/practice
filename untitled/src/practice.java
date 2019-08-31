import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class practice {

    public static void main(String[] args) {
        //iterator();

        reduce();
    }



    private static void iterator() {
        List<String> list = Arrays.asList("하나","둘","셋");

        Iterator<String> iterator = list.iterator();
        System.out.println("기존 Iterator 방식의 요소 찍기");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("자바8 Stream 방식의 요소 찍기");

        Stream<String> stream = list.stream();

        stream.forEach(name -> System.out.println(name));
    }

    public static class Student {
        private String name;
        private int score;

        Student(String name,int score){
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }

    private static void reduce() {
        List<Student> list = new ArrayList<>();

        list.add(new Student("김철수",100));
        list.add(new Student("김갑수",90));
        list.add(new Student("임호취",50));
        list.add(new Student("주성취",70));


        double average = list.stream().mapToInt(Student::getScore).average().getAsDouble();

        int sum = list.stream().mapToInt(Student::getScore).sum();

        long count = list.stream().mapToInt(Student::getScore).count();

        System.out.println("학생수 : "+count);
        System.out.println("점수합계 : "+sum);
        System.out.println("평균점수 : "+average);
    }
}
