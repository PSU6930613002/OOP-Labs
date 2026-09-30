public class ClubManagingSystem {
    private Club[] clubList;
    public ClubManagingSystem(Club[] clubList){
        this.clubList = clubList;
    }
    public int determineAllBudget(){
        int total = 0;
        for(Club count:clubList){
            total = total + count.determineBudget();
        }
        return total;
    }
    public int getAllMembers(){
        int total = 0;
        for(Club count:clubList){
            total = total + count.numMember;
        }
        return total;
    }
    public Club getHighestMemberClub(){
        Club highest = clubList[0];
        for(Club count:clubList){
            if(count.numMember > highest.numMember){
                highest = count;
            }
        }
        return highest;
    }
}