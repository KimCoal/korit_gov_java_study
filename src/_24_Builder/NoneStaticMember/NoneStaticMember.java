package _24_Builder.NoneStaticMember;

public class NoneStaticMember {
    private String name;
    private int age;
    private String email;

    private NoneStaticMember() {
    }
    // 외부에서 객체를 생성할 수 없는 상태의 클래스

    // 인스턴스 클래스 (내부 클래스)
    public class Builder {
        private final NoneStaticMember target;

        private Builder(NoneStaticMember target) {
            this.target = target;
        }

        public Builder name(String name) {
            target.name = name;
            return this;
        }

        public Builder age(int age) {
            target.age = age;
            return this;
        }

        public Builder email(String email) {
            target.email = email;
            return this;
        }

        public NoneStaticMember build(){
            return target;
        }
    }

    public static NoneStaticMember.Builder builder() {
        NoneStaticMember noneStaticMember = new NoneStaticMember();
        return noneStaticMember.new Builder(noneStaticMember);
    }
}
