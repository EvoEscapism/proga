package Sources;

public class Explorer extends Character implements Doing_work {
    private float power;
    private Job jobs;
    private Views views;
    private Planet planet_from;
    private String voice;


    public Explorer(String name, Job jobs, float power, Planet planet_from, Views views) {
        super(name);
        setPower(power);
        this.jobs = jobs;
        this.views = views;
    }


    @Override
    public void printInformation() {

            System.out.println("Сила исследователя: " + power + " Его работа: " + jobs.getDescribe() + "Его планета:" + planet_from);


    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Explorer explorer = (Explorer) obj;
        if (power == explorer.getPower() && voice == null && jobs == explorer.getJobs()) {
            return true;
        }else{
            return (power == explorer.getPower() && voice == explorer.getVoice() && jobs == null);
        }
    }

    @Override
    public String toString() {
        return "Исследователь: " + getName();
    }

    @Override
    public int hashCode(){
        return (int) power;
    }

    public void doWork() {

            System.out.println(getName() + " Делает работу " + jobs.getDescribe());

    }

    public void seeViews() {

        System.out.println(getName() + " Видит " + views.getDescribe());

    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        if (power < 0.0 || power > 10.0) {
            throw new NonExistentPowerException("Присвоена сила не от 0 до 10");
        }
        this.power = power;
    }
    public Job getJobs() {
        return jobs;
    }

    public String getVoice() {
        return voice;
    }
}
