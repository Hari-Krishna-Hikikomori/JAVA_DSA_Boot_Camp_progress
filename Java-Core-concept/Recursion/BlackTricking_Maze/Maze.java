package JAVA.BlackTricking_Maze;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        ArrayList<String> pos = new ArrayList<>(PossiableWays("", 0, 0, 2, 2));
        ArrayList<String> pos1 = new ArrayList<>(KnulMethod("", 2, 2));
        Boolean[][] maze ={{true,false,true},
                           {true,true,false},
                           {true,false,true}};

        System.out.println(pos);
        System.out.println(pos1);
        System.out.println(PossiableWays_Restricted("",0,0,maze));
        System.out.println(Mcount(2,2));

    }

    private static int Mcount(int d, int r) {
        if(r==0 || d == 0)
        {
            return 1;
        }
        int down = Mcount(d-1,r);
        int cross = Mcount(d-1,r-1);
        int right = Mcount(d,r-1);

        return right + down + cross;
    }

    static List<String> PossiableWays(String ans,int Down,int Right,int dis,int dis2)
    {
        ArrayList<String> pos = new ArrayList<>();
        if(Down == 1 && Right == 1)
        {
            return pos;
        }
        if(Down == dis && Right == dis2)
        {
            pos.add(ans);
            return pos;
        }

        if(Down != dis) {
            pos.addAll(PossiableWays(ans + "D", Down + 1, Right,dis,dis2));
        }

        if(Right != dis2) {
            pos.addAll(PossiableWays(ans + "R", Down, Right + 1,dis,dis2));
        }
        return pos;
    }
    static List<String> KnulMethod(String pos,int down , int right)
    {
        ArrayList<String> ans = new ArrayList<>();
        if(down == 0 && right == 0)
        {
            ans.add(pos);
            return ans;
        }
        if(down != 0 && right != 0)
        {
            ans.addAll(KnulMethod(pos+"C",down-1,right-1));
        }
        if(down != 0)
        {
            ans.addAll(KnulMethod(pos+"D",down-1,right));
        }

        if(right != 0)
        {
            ans.addAll(KnulMethod(pos+"R",down,right-1));
        }
        return ans;
    }
    static List<String> PossiableWays_Restricted(String ans,int Down,int Right,Boolean[][] maze)
    {
        ArrayList<String> pos = new ArrayList<>();
        if(!maze[Down][Right])
        {
            return pos;
        }
        if(Down == maze.length-1 && Right == maze[0].length-1)
        {
            pos.add(ans);
            return pos;
        }
        if(Down != maze.length-1 &&Right != maze[0].length-1)
        {
            pos.addAll(PossiableWays_Restricted(ans + "C", Down + 1, Right+1,maze));
        }

        if(Down != maze.length-1) {
            pos.addAll(PossiableWays_Restricted(ans + "D", Down + 1, Right,maze));
        }

        if(Right != maze[0].length-1) {
            pos.addAll(PossiableWays_Restricted(ans + "R", Down, Right + 1,maze));
        }
        return pos;
    }
}
