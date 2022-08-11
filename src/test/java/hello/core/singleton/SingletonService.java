package hello.core.singleton;

public class SingletonService {

    // 클래스 레벨에 딱 하나만 올라가게 된다.
    private static final SingletonService instance = new SingletonService();

    //조회
    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void Logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}

