package utils;

import entity.Users;

public class Auth {
    public static Users user = null;
    //    /**
//     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
//     */
    public static void clear() {
        Auth.user = null;
    }
    //    /**
//     * Kiểm tra xem đăng nhập hay chưa
//     */
    public static boolean isLogin() {
        return Auth.user != null;
    }
    //     /**
//     * Kiểm tra xem có phải là trưởng phòng hay không
//     */
    public static boolean isManager() {
        return Auth.isLogin() && user.getRole();
    }
    public static String getManagername() {
        if(Auth.isLogin()){
            return user.getFullname();
        }
        return null;
    }
    public static int getManagercode() {
        if(Auth.isLogin()){
            return user.getId();
        }
        return 0;
    }
    public static String getManagerpassword(){
        if(Auth.isLogin()){
            return user.getPassword();
        }
        return null;
    }

}
