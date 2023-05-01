//package Test;
//
//import java.awt.event.KeyEvent;
//
//public class test1 {
//    public static void main(String[] args) {
//
//
//
//        @Override
//        public void keyReleased(KeyEvent e) {
//            //对上，下，左，右进行判断
//            //左：37 上：38 右：39 下：40
//            int code = e.getKeyCode();
//            if (code == 37) {
//                System.out.println("向左移动");
//                if(y == 3){
//                    return;
//                }
//                //逻辑：
//                //把空白方块右方的数字往左移动
//                data[x][y] = data[x][y + 1];
//                data[x][y + 1] = 0;
//                y++;
//                //每移动一次，计数器就自增一次。
//                step++;
//                //调用方法按照最新的数字加载图片
//                initImage();
//
//            } else if (code == 38) {
//                System.out.println("向上移动");
//                if(x == 3){
//                    //表示空白方块已经在最下方了，他的下面没有图片再能移动了
//                    return;
//                }
//                data[x][y] = data[x + 1][y];
//                data[x + 1][y] = 0;
//                x++;
//                //每移动一次，计数器就自增一次。
//                //调用方法按照最新的数字加载图片
//                initImage();
//            } else if (code == 39) {
//                System.out.println("向右移动");
//                if(y == 0){
//                    return;
//                }
//                //逻辑：
//                //把空白方块左方的数字往右移动
//                data[x][y] = data[x][y - 1];
//                data[x][y - 1] = 0;
//                y--;
//                //每移动一次，计数器就自增一次。
//                step++;
//                //调用方法按照最新的数字加载图片
//                initImage();
//            } else if (code == 40) {
//                System.out.println("向下移动");
//                if(x == 0){
//                    return;
//                }
//                //把空白方块上方的数字往下移动
//                data[x][y] = data[x - 1][y];
//                data[x - 1][y] = 0;
//                x--;
//                //调用方法按照最新的数字加载图片
//                initImage();
//            }else if(code == 65){
//                initImage();
//            }else if(code == 87){
//                data = new int[][]{
//                        {1,2,3,4},
//                        {5,6,7,8},
//                        {9,10,11,12},
//                        {13,14,15,0}
//                };
//                initImage();
//            }
//        }
//    }
//}
