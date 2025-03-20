package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx3 {
    public static void main(String[] args) {

        // Member => 남자, 여자 구별 / 남자들의 나이 평균 구하기
        List<Member> members = Arrays.asList(
                new Member("홍길동", Member.MALE, 30),
                new Member("김나리", Member.FEMALE, 20),
                new Member("김정환", Member.MALE, 45),
                new Member("성춘향", Member.FEMALE, 27));

        // for 문
        int age = 0, count = 0;
        for (Member member : members) {
            if (member.getGender() == Member.MALE) {
                age += member.getAge();
                count++;
            }
        }
        System.out.println("남자 멤버 나이 평균 : " + (age / count));

        // Stream 문
        // filter(Predicate<? super Member> predicate)
        double ageAVG = members.stream().filter((member) -> member.getGender() == Member.MALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("남자 멤버 나이 평균 :" + ageAVG);

    }
}
