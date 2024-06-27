package ch09.sec07.exam02;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("Turning on");

        }

        @Override
        public void turnOff() {
            System.out.println("Turning off");
        }
};
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }
    public void use2() {
//로컬 변수에 익명 구현 객체 대입
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }
            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
