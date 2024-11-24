package Sources;

public enum Views {
    Village(" Большую деревню"),
    Mountains(" Скалистые лунные горы"),
    Сlearing(" Широкие поля"),
    Craters(" Глубокие лунные кратеры");


    private String view;

    Views(String describe_view) {
        this.view = describe_view;
    }

    public String getDescribe() {
        return view;
    }
}
