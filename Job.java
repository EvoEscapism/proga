
package Sources;

public enum Job {
    REPAIRMAN("Чинит поломавшиеся детали"),
    DOCTOR("Лечит болных"),
    EXPLORER("Изучает местность"),
    ARTIST("Пишет картины"),
    VORCHUN("Ворчит >:(");

    private String work;

    Job(String describe_work) {
        this.work = describe_work;
    }

    public String getDescribe() {
        return work;
    }
}

