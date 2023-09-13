package com.ketan.parkinglot.models;

import jakarta.persistence.*;

@Entity
public class Bot extends Player {
    @Column(name = "bot_rank")
    private int rank;
}
