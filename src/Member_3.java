public class Member_3 {
    private String firstName;

    private String lastName;

    private Team_3 teamOfEngneer;
    private Member_3 sara;

    private String describeTheJob;
    private int yearOfSeniorInCompany;
    private int getYearOfSeniorInArea;




    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isSenior(){
        boolean isSeniority=false;
        if(this.yearOfSeniorInCompany>=3 || this.getYearOfSeniorInArea>=5){
            isSeniority=true;
        }
        return isSeniority;
    }

    public Team_3 getTeamOfEngneer() {
        return teamOfEngneer;
    }
}
