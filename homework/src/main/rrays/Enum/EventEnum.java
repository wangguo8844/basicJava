package main.rrays.Enum;

public enum EventEnum {

    LAUNCH("lauch"), PAGEVIEW("pageview"),EVENT("event");

    EventEnum(String name) {
        this.name = name;
    }
    private String name;

    public String show(){
        System.out.println(this.name);
        EventEnum[] ee =values();
        for (EventEnum e:ee){
            System.out.println(e);
        }
        return null;
    }
}
