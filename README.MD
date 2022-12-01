인프런 [스프링 핵심 원리 - 기본편] 강의 실습 코드를 올려 놓습니다.

### 12월 2일 
- static import

테스트 코드를 작성 할 때, 매번 앞에 [ Assertions (import org.assertj.core.api.Assertions;) ] 을 붙여 사용하는데,

````java
Assertions.assertThat(discount).isEqualTo(1000);
````

해당 부분에 [ option + return ] 키를 눌러주면 [ Add on Demon static import for 'org.assertj.core.api.Assertions' ] 

````java
import static org.assertj.core.api.Assertions.*;

assertThat(discount).isEqualTo(1000);
````
위와 같이 간결하게 표현이 가능하다.

하나의 test class에서 Assertions을 많이 사용하게 되면, 이 부분을 static에 올려 놓으면 좋을 것 같다.

일반적인 import와 다른 점은, [변수]나 [메소드]를 별도의 [패키지], [클래스 명] 없이 접근이 가능하게 만들어준다.
