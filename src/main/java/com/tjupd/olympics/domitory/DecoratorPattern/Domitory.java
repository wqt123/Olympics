
    /**@
     * autor:wendi
     * */

    public class Domitory{
        /*住宿 楼房号 房间号*/
        private String building;
        private String room_number;
        public Domitory(String building,String room_number){
            this.building=building;
            this.room_number=room_number;

        }
        public String Get_building(){
            return building;
        }
        public String Get_room_number(){
            return room_number;
        }
    }
