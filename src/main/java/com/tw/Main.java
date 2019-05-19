package com.tw;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Library>libraryList=new ArrayList<>();
        while (true){
            System.err.println("1. 添加学生"+"\n"+"2. 生成成绩单"+"\n"+"3. 退出请输入你的选择（1～3）：");
            Scanner sc=new Scanner(System.in);
            int flage=sc.nextInt();
            if (flage==1){
                System.err.println("请输入学生信息（格式：姓名, 学号, 学科: 成绩, ...），按回车提交：");
                sc=new Scanner(System.in);
                String info=sc.nextLine();//控制台读进来的东西

                if (true){
                  //格式正确
                    String[] info_str=info.split(",");
                    //添加进libraryList
                    String[]math_info=info_str[2].split(":");
                    String[]lan_info=info_str[3].split(":");
                    String[]eng_info=info_str[4].split(":");
                    String[]pro_info=info_str[5].split(":");
                    Library library=new Library(info_str[0],Integer.parseInt(info_str[1]),math_info[0],Integer.parseInt(math_info[1]),lan_info[0],Integer.parseInt(lan_info[1]),eng_info[0],Integer.parseInt(eng_info[1]),pro_info[0],Integer.parseInt(pro_info[1]));
                    libraryList.add(library);
                    System.err.println("学生"+info_str[0]+"的成绩被添加");
                }else {
                    //错误格式
                    System.err.println("请按正确的格式输入（格式：姓名, 学号, 学科: 成绩, ...）：");
                }

            }else if (flage==2){
                //请输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：
                System.err.println("请输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交");
                sc=new Scanner(System.in);
                String id=sc.nextLine();//控制台读进来的

                if (true){
                    //格式正确
                    String str ;//显示台输出
                    int all_total=0;//记录全班总分；
                    List<Integer>mid=new ArrayList<>();//存储每个人的总成绩，后求中位数
                    int flag=0;//记录一共查询个数
                    str="成绩单\n" +
                            "name|math|chinese|english|program|avg|total\n" +
                            "========================\n";
                    String[]id_info=id.split(",");
                    List<Integer>id_number=new ArrayList<>();
                    for (int i = 0; i <id_info.length ; i++) {
                        id_number.add(Integer.parseInt(id_info[i]));
                    }
                    for (int i = 0; i <id_number.size() ; i++) {
                        for (int j = 0; j <libraryList.size() ; j++) {
                            if (id_number.get(i)==libraryList.get(j).getId()){
                                Library library_1=libraryList.get(j);
                                int math_number=library_1.getMath_number();
                                int lang_number=library_1.getLang_number();
                                int eng_number=library_1.getEnglish_number();
                                int pro_number=library_1.getProgram_number();
                                int total=math_number+lang_number+eng_number+pro_number;
                                int avg=total/4;
                                str=str +libraryList.get(j).getName()+"|"+math_number+"|"+lang_number+"|"+eng_number+"|"+pro_number+"|"+avg+"|"+total+"\n";
                                all_total=all_total+total;
                                mid.add(total);
                                flag++;
                            }
                        }
                    }
                    double midNum;
                    Collections.sort(mid);
                    if(mid.size()%2 == 1){
                        midNum = mid.get(mid.size()/2 + 1);
                    }else{
                        midNum = (mid.get(mid.size()/2) + mid.get(mid.size()/2-1))/2;
                    }
                    str=str+"========================\n" +
                            "全班总分平均数："+all_total/flag+"\n" +
                            "全班总分中位数："+midNum;
                    System.err.println(str);
                }else {
                    //格式不正确
                    System.err.println("请按正确的格式输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：");
                }
            }else if (flage==3){
                return;
            }
        }

    }

}
