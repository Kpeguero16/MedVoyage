package diagnosis.diagnosis.src;

/*
    Parent class of all the diseases listed.
    Each disease will have a symptom and a name.
    Name - a string containing the medical term for the disease or condition
    Symptoms - A string array that contains the symptoms of the disease.
 */
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
