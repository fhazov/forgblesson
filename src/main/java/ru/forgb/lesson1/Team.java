package ru.forgb.lesson1;

public class Team {
    private String nameTeam;
    private Animal members[] ;

    public Team(String nameTeam, Cat cat, Wolf wolf, Cat cat1, Turtle turtle) {
        this.nameTeam = nameTeam;
    }

    public Team (String nameTeam, Animal ... membersGiven) {
        this.nameTeam = nameTeam;
        this.members = membersGiven;
    }

    public void getTeamInfo() {
        System.out.println("Команда - " + nameTeam);
        for (Animal members : members) {
            if (members instanceof Wolf) {
                System.out.println("Волк " + members.getName());
            }
            if (members instanceof Cat) {
                System.out.println("Кот " + members.getName());
            }
            if (members instanceof Turtle) {
                System.out.println("Черепаха " + members.getName());
            }
        }
    }
    public void showResults(){
        for (Animal members : members) {
            if (!members.isOnDistance()) {
                break;
            }
        }
    }
    public void doIt(Obstacle obstacle){
        for (Animal members : members) {
            obstacle.doIt(members);
        }
    }
}
