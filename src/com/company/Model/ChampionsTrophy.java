package com.company.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ChampionsTrophy {
    private static ChampionsTrophy championsTrophy = null;
    private String TournamentName;
    private ArrayList<Team> registeredTeams;
    private ArrayList<Match> matchesList;
    Map<Team,Integer> Points;
    Team WINNER;
    private ChampionsTrophy(String tournamentName){
        this.matchesList = new ArrayList<>();
        this.registeredTeams = new ArrayList<>();
        this.TournamentName = tournamentName;
        this.Points = new HashMap<>();
        this.WINNER = null;
        System.out.println(":::::::::::::::::TOURNAMENT HAS BEEN INITIATED:::::::::::");
    }

    public String getTournamentName() {
        return TournamentName;
    }

    public void setTournamentName(String tournamentName) {
        TournamentName = tournamentName;
    }

    public ArrayList<Team> getRegisteredTeams() {
        return registeredTeams;
    }

    public void setRegisteredTeams(ArrayList<Team> registeredTeams) {
        this.registeredTeams = registeredTeams;
    }

    public ArrayList<Match> getMatchesList() {
        return matchesList;
    }

    public void setMatchesList(ArrayList<Match> matchesList) {
        this.matchesList = matchesList;
    }

    public Map<Team, Integer> getPoints() {
        return Points;
    }

    public void setPoints(Map<Team, Integer> points) {
        Points = points;
    }

    public static ChampionsTrophy organiseChampionsTrophy(String TournamentName){
        if(championsTrophy==null){
            return new ChampionsTrophy(TournamentName);
        }else{
            System.out.println(":::::::ONE TOURNAMENT"+ championsTrophy.TournamentName +"HAS ALREADY BEEN RUNNING::::");
        }
        return championsTrophy;
    }

    public int getTeams(){
        return this.registeredTeams.size();
    }

    public int RegisterTeam(Team team){
        if(team.Teamsize()<11){
            return 0;
        }
        for(Team itr : this.registeredTeams){
            if(team.equals(itr)){
                return 1;
            }
        }
        if(team.Teamsize()>16){
            return 2;
        }
        this.registeredTeams.add(team);
        return 3;
    }




    //based on points.................
    public void OrganizeSemiFinals(){

    }
    public void OrganizeFinals(){

    }
    Team getWINNER(){
        if(this.WINNER==null){
            System.out.println("TOURNAMENT IS NOT COMPLETE YET");
        }
        return this.WINNER;
    }

}
