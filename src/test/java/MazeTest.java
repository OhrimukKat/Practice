import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class MazeTest {

    @Ignore
    private Maze initMaze(){ // создаём лабиринт для тестов
        int width = 5;
        int height = 5;
        int[][] array = {{0,1,0,1,0},
                         {0,1,1,0,0},
                         {0,0,0,1,0},
                         {1,0,1,0,1},
                         {0,1,0,0,0}};
        Maze maze = new Maze(array, width, height);
        return maze;
    }

    @Test
    public void checkLeftTest() {
        Maze maze = initMaze();
        assertFalse("CheckLeft-1", maze.check_left(0,0));
        assertFalse("CheckLeft-2", maze.check_left(0,4));
        assertFalse("CheckLeft-3", maze.check_left(0,2));
        assertFalse("CheckLeft-4", maze.check_left(4,2));
        assertTrue("CheckLeft-5", maze.check_left(1,4));
        assertTrue("CheckLeft-6", maze.check_left(4,3));
    }

    @Test
    public void checkRightTest(){
        Maze maze = initMaze();
        assertFalse("CheckRight-1", maze.check_right(4,4));
        assertFalse("CheckRight-2", maze.check_right(3,1));
        assertFalse("CheckRight-3", maze.check_right(2,4));
        assertTrue("CheckRight-4", maze.check_right(1,0));
        assertTrue("CheckRight-5", maze.check_right(2,1));
        assertTrue("CheckRight-6", maze.check_right(2,1));
    }

    @Test
    public void checkUpTest(){
        Maze maze = initMaze();//вверх
        assertFalse("CheckLeft-1", maze.check_up(0,0));
        assertFalse("CheckLeft-2", maze.check_up(0,4));
        assertFalse("CheckLeft-3", maze.check_up(0,2));
        assertFalse("CheckLeft-4", maze.check_up(4,2));
        assertTrue("CheckLeft-5", maze.check_up(1,4));
        assertTrue("CheckLeft-6", maze.check_up(4,3));
    }

    @Test
    public void checkDownTest(){
        Maze maze = initMaze();
        assertFalse("CheckRight-1", maze.check_down(4,4));
        assertFalse("CheckRight-2", maze.check_down(3,1));
        assertFalse("CheckRight-3", maze.check_down(2,4));
        assertFalse("CheckRight-4", maze.check_down(3,3));
        assertTrue("CheckRight-5", maze.check_down(2,1));
        assertTrue("CheckRight-6", maze.check_down(2,1));
    }

    @Test
    public void InitTest(){//проверка инициализации массива
        Maze maze = initMaze();
        assertEquals(0, maze.getAccsess(0,0));//получить доступ к ячейке массива
        assertEquals(1, maze.getAccsess(1,1));
        assertEquals(1, maze.getAccsess(0,1));
        assertEquals(0, maze.getAccsess(1,0));

        assertEquals(0, maze.getAccsess(0,4));
        assertEquals(0, maze.getAccsess(3,3));
        assertEquals(0, maze.getAccsess(4,0));
        assertEquals(0, maze.getAccsess(4,4));
    }

    @Test
    public void clearTest() {//проверка на очистку весь массив = 0
        Maze maze = initMaze();
        maze.clear();
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) assertEquals("Check [" + i + "][" + j + "]",
                                                0, maze.getAccsess(i, j));
    }
}