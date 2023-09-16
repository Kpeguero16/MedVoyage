public class Disease {
    private String[] symptoms;
    private String name;

    public Disease(String name, String[] symptoms)
    {
        this.name = name;
        this.symptoms = symptoms;
    }

    public String[] getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String[] symptoms) {
        this.symptoms = symptoms;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
