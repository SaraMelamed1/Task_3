public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static Member_3 MostProductiveMember(Task_3[] allTasks){
        int count=0;
        int check=0;
    Member_3 winner=new Member_3();
    for(int i=0;i<allTasks.length;i++){
        Member_3 member_3=allTasks[i].getUserOfCareTask();
            if(allTasks[i].getStatusOfTask()==2){
               Member_3 headMember=member_3.getTeamOfEngneer().getNameOfHeadTeam();
               if(member_3!=headMember){
                 for(int j=0;j<allTasks.length;j++){
                     if(allTasks[j].getUserOfCareTask()==member_3){
                         count++;
                     }

                 }
                 if(count>check){
                     check=count;
                     winner=member_3;

                 }
               }

            }

            }
    return winner;
    }
}