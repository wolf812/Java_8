package ra.entity;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Student implements IEntity<Student>, Serializable {
    static List<Student> studentList = new ArrayList<>();

    private String studentId;
    private String studentName;
    private String birthday;
    private int age;
    private boolean sex;
    private float mark_html;
    private float mark_css;
    private float mark_js;
    private float avgMark;
    private String studentRank;


    //constructors

    public Student() {
    }

    public Student(String studentId, String studentName, String birthday, int age, boolean sex, float mark_html, float mark_css, float mark_js, float avgMark, String studentRank) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthday = birthday;
        this.age = age;
        this.sex = sex;
        this.mark_html = mark_html;
        this.mark_css = mark_css;
        this.mark_js = mark_js;
        this.avgMark = avgMark;
        this.studentRank = studentRank;
    }

    //Get and Set


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getMark_html() {
        return mark_html;
    }

    public void setMark_html(float mark_html) {
        this.mark_html = mark_html;
    }

    public float getMark_css() {
        return mark_css;
    }

    public void setMark_css(float mark_css) {
        this.mark_css = mark_css;
    }

    public float getMark_js() {
        return mark_js;
    }

    public void setMark_js(float mark_js) {
        this.mark_js = mark_js;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public String getStudentRank() {
        return studentRank;
    }

    public void setStudentRank(String studentRank) {
        this.studentRank = studentRank;
    }

    /**
     * -----------------------Nhập thông tin cơ bản của sinh viên-----------------------
     *
     * @param sc
     * @param list
     */
//    @Override
//    public boolean inputData(Scanner sc, List<Student> studentList) {
//
//        //Mã sinh viên
//        boolean studentIdExit = true;
//        do {
//            System.out.println("Nhập mã sinh viên: ");
//            String studentId = sc.nextLine();
//            boolean checkStdId = false;
//            for (Student student :
//                    studentList) {
//                if (student.getStudentId().equalsIgnoreCase(studentId)) {
////                    System.err.println("Mã sinh viên đã tồn tại, vui lòng nhập lại.");
//                    checkStdId = true;
//                }
//            }
//            if (checkStdId) {
//                System.err.println("Mã sinh viên đã tồn tại, vui lòng nhập lại.");
//            } else {
//                this.studentId = studentId;
//                if (studentId.length() == 4 && studentId.charAt(0) == 'S') {
//                    this.studentId = studentId;
//                    studentIdExit = false;
//                    break;
//                } else {
//                    System.err.println("Tên sinh viên phải bắt đầu bằng S và gồm 4 ký tự, vui lòng nhập lại");
//                }
//            }
//
//        } while (studentIdExit);
//        boolean checkStdName = true;
//        System.out.println("Nhập tên sinh viên: ");
//        do {
//            this.studentName = sc.nextLine();
//            if (this.studentName.length() >= 10 && this.studentName.length() <= 50) {
//                break;
//            } else {
//                System.err.println("Tên sinh viên từ 10-60 ký tự, vui lòng nhập lại");
//            }
//
//        } while (checkStdName);
//
//        //birthday
//        boolean checkDateExit = true;
//        do {
//            String datePattern = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
//            System.out.println("Nhập ngày tháng năm sinh: ");
//            String birthDay = sc.nextLine();
//            boolean isDate = false;
//            isDate = birthDay.matches(datePattern);
//            if (isDate) {
//                checkDateExit = false;
//                this.birthday = birthDay;
//                break;
//            } else {
////                System.err.println("Ngày tháng năm sinh phải theo kiểu định dạng dd/mm/yyyy, vui lòng nhập lại.");
//                try {
//                    throw new Exception("Ngày tháng năm sinh phải theo kiểu định dạng dd/mm/yyyy, vui lòng nhập lại.");
//
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//            }
//        } while (checkDateExit);
//        // tuổi sinh viên tính từ ngày sinh của sinh viên
//        //• sex – Boolean: giới tính sinh viên chỉ nhận true|false
//        System.out.println("Nhập vào giới tính sinh viên: ");
//        do {
//                 String sex = sc.nextLine();
//            if (sex.equalsIgnoreCase("true")||sex.equalsIgnoreCase("false")) {
//                return Boolean.parseBoolean(sex);
//            }else{
//                System.err.println("Giới tính chỉ nhận giá trị true | false. Vui lòng nhập lại.");
//            }
//
//        }while (true);
//
//        //----------CSS
//
//
//        try {
//            boolean checkCssMark = true;
//
//            System.out.println("Nhập vào điểm CSS: ");
//            do {
//                this.mark_css = Float.parseFloat(sc.nextLine());
//                if (this.mark_css >= 0 && this.mark_css <= 10) {
//                    break;
//                } else {
//                    System.err.println("vui lòng nhập trong khoảng từ 0-10, vui lòng nhập lại");
//                }
//            } while (checkCssMark);
//
//        }catch (NumberFormatException ex){
//            System.err.println("Điểm phải là số");
//        }catch (Exception e){
//            System.err.println("Lỗi, hãy liên hệ...........");
//        }
//
//        //HTML
//        try {
//            boolean checkHtmlMark = true;
//            System.out.println("Nhập vào điểm HTML: ");
//            do {
//                this.mark_html = Float.parseFloat(sc.nextLine());
//                if (this.mark_html >= 0 && this.mark_html <= 10) {
//                    break;
//                } else {
//                    System.err.println("vui lòng nhập trong khoảng từ 0-10, vui lòng nhập lại");
//                }
//            } while (checkHtmlMark);
//        }catch (NumberFormatException ex){
//            System.err.println("Điểm phải là số");
//        }catch (Exception e){
//            System.err.println("Lỗi, hãy liên hệ...........");
//        }
//
//        //Điểm JS
//        try {
//            boolean checkJslMark = true;
//            System.out.println("Nhập vào điểm Javascript: ");
//            do {
//                this.mark_js = Float.parseFloat(sc.nextLine());
//                if (this.mark_js >= 0 && this.mark_js <= 10) {
//                    break;
//                } else {
//                    System.err.println("vui lòng nhập trong khoảng từ 0-10, vui lòng nhập lại");
//                }
//            } while (checkJslMark);
//        }catch (NumberFormatException ex){
//            System.err.println("Điểm phải là số");
//        }catch (Exception e){
//            System.err.println("Lỗi, hãy liên hệ...........");
//        }
//    }
    @Override
    public void inputData(Scanner sc, List<Student> list) {
        this.studentId = validataStudentId(sc, list);
        this.studentName = validateStudentName(sc);
        this.birthday = String.valueOf(valiDate(sc));
        this.sex = validateSex(sc);
        this.mark_html = validateMarkHTML(sc);
        this.mark_css = validateMarkCSS(sc);
        this.mark_js = validateMarkJS(sc);
    }

    /**
     * Nhập mã sinh viên
     *
     * @param sc
     * @param list
     * @return
     */
    public static String validataStudentId(Scanner sc, List<Student> list) {
        do {
            System.out.println("Nhập mã sinh viên: ");
            String studentId = sc.nextLine();
            boolean checkStdId = false;
            for (Student student :
                    studentList) {
                if (student.getStudentId().equalsIgnoreCase(studentId)) {
//                    System.err.println("Mã sinh viên đã tồn tại, vui lòng nhập lại.");
                    checkStdId = true;
                }
            }
            if (checkStdId) {
                System.err.println("Mã sinh viên đã tồn tại, vui lòng nhập lại.");
            } else {
                if (studentId.length() == 4 && studentId.charAt(0) == 'S') {
                    return studentId;
                } else {
                    System.err.println("Tên sinh viên phải bắt đầu bằng S và gồm 4 ký tự, vui lòng nhập lại");
                }
            }

        } while (true);
    }

    /**
     * Nhập tên sinh viên
     *
     * @param sc
     * @return
     */
    public static String validateStudentName(Scanner sc) {

        System.out.println("Nhập tên sinh viên: ");
        do {
            String studentName = sc.nextLine();
            if (studentName.length() >= 10 && studentName.length() <= 50) {
                return studentName;
            } else {
                System.err.println("Tên sinh viên từ 10-60 ký tự, vui lòng nhập lại");
            }

        } while (true);
    }

    /**
     * nhập ngày sinh
     *
     * @param sc
     * @return
     */
    public static String valiDate(Scanner sc) {
        System.out.println("Nhập vào ngày sinh của sinh viên:");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        do {
            try {
                Date birthDay = sdf.parse(sc.nextLine());
                Calendar cal = Calendar.getInstance();
                cal.setTime(birthDay);
                if (cal.get(Calendar.YEAR) < 2005) {
                    return String.valueOf(birthDay);
                } else {
                    System.err.println("Năm sinh phải trước năm 2005, vui lòng nhập lại");
                }
            } catch (ParseException ex1) {
                System.err.println("Ngày sinh phải có định dạng dd/MM/yyyy, vui lòng nhập lại");
            } catch (Exception ex) {
                System.err.println("Xảy ra lỗi không xác định, vui lòng liên hệ với hệ thống");
            }
        } while (true);
    }

    /**
     * Nhập giới tính sinh viên
     *
     * @param sc
     * @return
     */
    public static boolean validateSex(Scanner sc) {
        System.out.println("Nhập vào giới tính của sinh viên:");
        do {
            String sex = sc.nextLine();
            if (sex.equalsIgnoreCase("true") || sex.equalsIgnoreCase("false")) {
                return Boolean.parseBoolean(sex);
            } else {
                System.err.println("Giới tính chỉ nhận giá trị true | false, vui lòng nhập lại");
            }
        } while (true);
    }

    /**
     * Nhập điểm HTML
     *
     * @param sc
     * @return
     */
    public static float validateMarkHTML(Scanner sc) {
        System.out.println("Nhập vào điểm html");
        do {
            try {
                float mark_html = Float.parseFloat(sc.nextLine());
                if (mark_html >= 0 && mark_html <= 10) {
                    return mark_html;
                } else {
                    System.err.println("Điểm HTML trong khoảng 0-10, vui lòng nhập lại");
                }
            } catch (NumberFormatException ex1) {
                System.err.println("Điểm html không phải định dạng số thực, vui lòng nhập lại");
            } catch (Exception ex) {
                System.err.println("Lỗi không xác định, vui lòng liên hệ hệ thống");
            }
        } while (true);
    }

    /**
     * Nhập điểm Css
     *
     * @param sc
     * @return
     */
    public static float validateMarkCSS(Scanner sc) {
        System.out.println("Nhập vào điểm css");
        do {
            try {
                float mark_css = Float.parseFloat(sc.nextLine());
                if (mark_css >= 0 && mark_css <= 10) {
                    return mark_css;
                } else {
                    System.err.println("Điểm css trong khoảng 0-10, vui lòng nhập lại");
                }
            } catch (NumberFormatException ex1) {
                System.err.println("Điểm css không phải định dạng số thực, vui lòng nhập lại");
            } catch (Exception ex) {
                System.err.println("Lỗi không xác định, vui lòng liên hệ");
            }
        } while (true);
    }

    /**
     * NHập điểm JS
     *
     * @param sc
     * @return
     */
    public static float validateMarkJS(Scanner sc) {
        System.out.println("Nhập vào điểm js");
        do {
            try {
                float mark_js = Float.parseFloat(sc.nextLine());
                if (mark_js >= 0 && mark_js <= 10) {
                    return mark_js;
                } else {
                    System.err.println("Điểm js trong khoảng 0-10, vui lòng nhập lại");
                }
            } catch (NumberFormatException ex1) {
                System.err.println("Điểm js không phải định dạng số thực, vui lòng nhập lại");
            } catch (Exception ex) {
                System.err.println("Lỗi không xác định, vui lòng liên hệ");
            }
        } while (true);
    }

    @Override
    public void displayData() {
        String checkSex = this.sex ? "Nam" : "Nữ";
        System.out.printf("Mã sinh viên: %10s  Tên sinh viên: %20s\tNgày sinh: %td-%tb-%tY Giới tính: %10s\n", this.studentId, this.studentName, this.birthday, checkSex);
        System.out.printf("Điểm HTML: %.2f ----- Điểm CSS: %.2f ----- Điểm Javascript: %.2f\n", this.mark_html, this.mark_css, this.mark_js);
        System.out.println("---------------------------------------------------------------------------");
    }

    @Override
    public void calAge() {
        Date now = new Date();
        this.age = now.getYear() - this.birthday.getYear();
    }


    @Override
    public void calAvgMark_Rank() {
        avgMark = (mark_css + mark_js + mark_html) / 3;
        if (this.avgMark < 5) {
            this.studentRank = "yếu";
//            System.out.println("Xếp loại: Yếu");
        } else if (this.avgMark < 7) {
            this.studentRank = "trung bình";
//            System.out.println("Xếp loại: Trung bình");
        } else if (this.avgMark < 8) {
            this.studentRank = "Khá";
//            System.out.println("Xếp loại: Khá");
        } else if (this.avgMark < 9) {
            this.studentRank = "Giỏi";
        } else {
            this.studentRank = "Xuất sắc";
//            System.out.println("Xếp loại: Xuất sắc");
        }


    }


}
