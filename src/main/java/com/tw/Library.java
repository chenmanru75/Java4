package com.tw;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
//    String data="2\n";//输入的选项
//    String  data_info="Mary,1,math:75,chinese:95,english:80,program:80";//选项1输入的内容
    //Lily,2,math:75,chinese:95,english:80,program:50
//    String data_id="1，2";//查询的学号
    private String name;
    private int id;
    private  String math;
    private int math_number;
    private  String lang;
    private int lang_number;
    private  String english;
    private int english_number;
    private  String program;
    private int program_number;

    public boolean someLibraryMethod() {
        return true;
    }

    public Library() {
    }

    public Library(String name, int id, String math, int math_number, String lang, int lang_number, String english, int english_number, String program, int program_number) {
        this.name = name;
        this.id = id;
        this.math = math;
        this.math_number = math_number;
        this.lang = lang;
        this.lang_number = lang_number;
        this.english = english;
        this.english_number = english_number;
        this.program = program;
        this.program_number = program_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public int getMath_number() {
        return math_number;
    }

    public void setMath_number(int math_number) {
        this.math_number = math_number;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getLang_number() {
        return lang_number;
    }

    public void setLang_number(int lang_number) {
        this.lang_number = lang_number;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public int getEnglish_number() {
        return english_number;
    }

    public void setEnglish_number(int english_number) {
        this.english_number = english_number;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getProgram_number() {
        return program_number;
    }

    public void setProgram_number(int program_number) {
        this.program_number = program_number;
    }

}
