package GuiApp;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 06.10.2021
 */

public class GuiPanel extends JPanel { //Ctrl + click

    private JPanel appControlArea;
    private JButton btnStart;
    private JButton btnExit;

    private JPanel gameInfoArea;
    private JLabel levelInfo;
    private JLabel sizeMapInfo;
    private JLabel enemyCountInfo;
    private JLabel enemyHpInfo;
    private JLabel enemyStrInfo;

    private JPanel playerInfoArea;
    private JLabel playerHpInfo;
    private JLabel playerStrInfo;
    private JLabel playerPositionInfo;

    private JPanel playerControlArea;
    private JButton playerMoveUp;
    private JButton playerMoveDown;
    private JButton playerMoveLeft;
    private JButton playerMoveRight;

    private JTextArea gameLog;
    private JScrollPane scrollLogPanel;


    GuiPanel() {
        setLayout(new GridLayout(5, 1));

        setupAppControlArea();
        setupGameInfoArea();
        setupPlayerInfoArea();
        setupPlayerControlArea();
        setupGameLog();

        constructMainPanel();


//        add(btnStart);
//        add(btnExit);

    }

    private void constructMainPanel() {
        add(appControlArea);
        add(gameInfoArea);
        add(playerInfoArea);
        add(playerControlArea);
        add(scrollLogPanel);

    }

    private void setupAppControlArea() {
        appControlArea = new JPanel();
        appControlArea.setLayout(new GridLayout(3,1));
        btnStart = new JButton("<html><b>Start Game</b></html>");
        btnExit = new JButton("Exit Game");

        appControlArea.add(new JLabel("=Game Control="));
        appControlArea.add(btnStart);
        appControlArea.add(btnExit);
    }

    private void setupGameInfoArea() {
        gameInfoArea = new JPanel();
        gameInfoArea.setLayout(new GridLayout(6,1));
        levelInfo = new JLabel("Level: -");
        sizeMapInfo = new JLabel("Size Map: -:-");
        enemyCountInfo = new JLabel("Enemies: -");
        enemyHpInfo = new JLabel("Enemies HP: -");
        enemyStrInfo = new JLabel("Enemies STR: -");

        gameInfoArea.add(new JLabel("=Game Info="));
        gameInfoArea.add(levelInfo);
        gameInfoArea.add(sizeMapInfo);
        gameInfoArea.add(enemyCountInfo);
        gameInfoArea.add(enemyHpInfo);
        gameInfoArea.add(enemyStrInfo);
    }

    private void setupPlayerInfoArea() {
        playerInfoArea = new JPanel();
        playerInfoArea.setLayout(new GridLayout(4,1));
        playerHpInfo = new JLabel("Health: -");
        playerStrInfo = new JLabel("Power: -");
        playerPositionInfo = new JLabel("Position: -:-");

        playerInfoArea.add(new JLabel("=Player Info="));
        playerInfoArea.add(playerHpInfo);
        playerInfoArea.add(playerStrInfo);
        playerInfoArea.add(playerPositionInfo);
    }

    private void setupPlayerControlArea() {
        playerControlArea = new JPanel();
        playerControlArea.setLayout(new GridLayout(1,4));
        playerMoveUp = new JButton("\uD83E\uDC45");
        playerMoveDown = new JButton("\uD83E\uDC47");
        playerMoveLeft = new JButton("\uD83E\uDC44");
        playerMoveRight = new JButton("\uD83E\uDC46");

        playerControlArea.add(playerMoveLeft);
        playerControlArea.add(playerMoveUp);
        playerControlArea.add(playerMoveDown);
        playerControlArea.add(playerMoveRight);
    }

    private void setupGameLog() {
        gameLog = new JTextArea();
        scrollLogPanel = new JScrollPane(gameLog);
        gameLog.setLineWrap(true);
        gameLog.setEditable(false);
    }


}
