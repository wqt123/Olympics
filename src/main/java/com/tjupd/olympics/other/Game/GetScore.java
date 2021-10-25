package com.tjupd.olympics.other.Game;

import lombok.Data;

import java.util.List;

@Data
public class GetScore {
    private int type;

    private List<NameWithScore> scores;
}
