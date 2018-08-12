public class ClassConcepts {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //Setters
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("911")){
            this.model = model;
        } else {
            this.model = "unknown";
        }

    }
    //Getters
    public String getModel(){
        return this.model;
    }

}
