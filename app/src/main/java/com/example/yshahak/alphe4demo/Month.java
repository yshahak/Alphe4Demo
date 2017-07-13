package com.example.yshahak.alphe4demo;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yshahak on 07/10/2016.
 */
@Entity
public class Month {


    @Ignore
    private int monthNumberOfDays;

    @PrimaryKey @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "year_name")
    private String yearName;
    @ColumnInfo(name = "month_name")
    private String monthName;
    @ColumnInfo (name = "head_offset")
    private int headOffst;
    @ColumnInfo(name = "trail_offset")
    private int trailOffse;
    @ColumnInfo(name = "full_month")
    private boolean isFullMonth;
    @ColumnInfo(name = "begin")
    private long beginOfMonth;
    @ColumnInfo(name = "end")
    private long endOfMonth;


    public Month() {
    }



    public void setMonthNumberOfDays(int monthNumberOfDays) {
        this.monthNumberOfDays = monthNumberOfDays;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public void setHeadOffst(int headOffst) {
        this.headOffst = headOffst;
    }

    public void setTrailOffse(int trailOffse) {
        this.trailOffse = trailOffse;
    }

    public void setFullMonth(boolean fullMonth) {
        isFullMonth = fullMonth;
    }

    public void setBeginOfMonth(long beginOfMonth) {
        this.beginOfMonth = beginOfMonth;
    }

    public void setEndOfMonth(long endOfMonth) {
        this.endOfMonth = endOfMonth;
    }

    public String getYearName() {
        return yearName;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getMonthNumberOfDays() {
        return monthNumberOfDays;
    }

    public int getId() {
        return id;
    }

    public int getHeadOffst() {
        return headOffst;
    }

    public int getTrailOffse() {
        return trailOffse;
    }

    public boolean isFullMonth() {
        return isFullMonth;
    }

    public long getBeginOfMonth() {
        return beginOfMonth;
    }

    public long getEndOfMonth() {
        return endOfMonth;
    }
}