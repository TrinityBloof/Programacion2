/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author gara8
 */
public class ValidarMovimiento {
    
    public boolean validaMov(String posActual, String posNext, String estado, String estado2) {
        //0,0
        if ("0,0".equals(posActual)) {
            if ("1,0".equals(posNext) || "0,1".equals(posNext)) {
                if ("1,0".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                } else if ("0,1".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("0,1".equals(posActual)) { //0,1
            if ("0,0".equals(posNext) || "0,2".equals(posNext)) {
                if ("0,2".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("0,1".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,1".equals(posNext)) {
                if ("1,1".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("0,1".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("0,2".equals(posActual)) { //0,2
            if ("0,1".equals(posNext) || "0,3".equals(posNext)) {
                if ("0,1".equals(posNext) && "Pared".equals(estado) || "0,3".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("0,2".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,2".equals(posNext)) {
                if ("1,2".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("0,2".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("0,3".equals(posActual)) { //0,3
            if ("0,2".equals(posNext) || "0,4".equals(posNext)) {
                if ("0,2".equals(posNext) && "Pared".equals(estado) || "0,4".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("0,3".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,3".equals(posNext)) {
                if ("1,3".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("0,3".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("0,4".equals(posActual)) { //0,4
            if ("0,3".equals(posNext) || "0,5".equals(posNext)) {
                if ("0,3".equals(posNext) && "Pared".equals(estado) || "0,5".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("0,4".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,4".equals(posNext)) {
                if ("1,4".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("0,4".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("0,5".equals(posActual)) { //0,5
            if ("0,4".equals(posNext) || "0,6".equals(posNext)) {
                if ("0,4".equals(posNext) && "Pared".equals(estado) || "0,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("0,5".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,5".equals(posNext)) {
                if ("1,5".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("0,5".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("0,6".equals(posActual)) { //0,6
            if ("0,5".equals(posNext) || "0,7".equals(posNext)) {
                if ("0,5".equals(posNext) && "Pared".equals(estado) || "0,7".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("0,6".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,6".equals(posNext)) {
                if ("1,6".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("0,6".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("0,7".equals(posActual)) { //0,7
            if ("0,6".equals(posNext) || "0,3".equals(posNext)) {
                if ("0,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("0,7".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,7".equals(posNext)) {
                if ("1,7".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("0,7".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("1,0".equals(posActual)) {
            if ("1,1".equals(posNext)) {
                if ("1,1".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("1,0".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,0".equals(posNext)) {
                if ("2,0".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("1,0".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("0,0".equals(posNext)) {
                if ("1,0".equals(posActual) && "Techo".equals(estado)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("1,1".equals(posActual)) { //1,1
            if ("1,0".equals(posNext) || "1,2".equals(posNext)) {
                if ("1,0".equals(posNext) && "Pared".equals(estado) || "1,2".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("1,1".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,1".equals(posNext)) {
                if ("2,1".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("1,1".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("0,1".equals(posNext)) {
                if ("0,1".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("1,1".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("1,2".equals(posActual)) { //1,2
            if ("1,1".equals(posNext) || "1,3".equals(posNext)) {
                if ("1,1".equals(posNext) && "Pared".equals(estado) || "1,3".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("1,2".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,2".equals(posNext)) {
                if ("2,2".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("1,2".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("0,2".equals(posNext)) {
                if ("0,2".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("1,2".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("1,3".equals(posActual)) { //1,3
            if ("1,2".equals(posNext) || "1,4".equals(posNext)) {
                if ("1,2".equals(posNext) && "Pared".equals(estado) || "1,4".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("1,3".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,3".equals(posNext)) {
                if ("2,3".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("1,3".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("0,3".equals(posNext)) {
                if ("0,3".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("1,3".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("1,4".equals(posActual)) { //1,4
            if ("1,3".equals(posNext) || "1,5".equals(posNext)) {
                if ("1,3".equals(posNext) && "Pared".equals(estado) || "1,5".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("1,4".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,4".equals(posNext)) {
                if ("2,4".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("1,4".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("0,4".equals(posNext)) {
                if ("0,4".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("1,4".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("1,5".equals(posActual)) { //1,4
            if ("1,4".equals(posNext) || "1,6".equals(posNext)) {
                if ("1,4".equals(posNext) && "Pared".equals(estado) || "1,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("1,5".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,5".equals(posNext)) {
                if ("2,5".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("1,5".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("0,5".equals(posNext)) {
                if ("0,5".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("1,5".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("1,6".equals(posActual)) { //1,4
            if ("1,5".equals(posNext) || "1,7".equals(posNext)) {
                if ("1,5".equals(posNext) && "Pared".equals(estado) || "1,7".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("1,6".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,6".equals(posNext)) {
                if ("2,6".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("1,6".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("0,6".equals(posNext)) {
                if ("0,6".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("1,6".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
         else if("1,7".equals(posActual)) { //1,4
            if ("1,6".equals(posNext)) {
                if ("1,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("1,7".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,7".equals(posNext)) {
                if ("2,7".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("1,7".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("0,7".equals(posNext)) {
                if ("0,7".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("1,7".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("2,0".equals(posActual)) {
            if ("2,1".equals(posNext)) {
                if ("2,1".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("2,0".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,0".equals(posNext)) {
                if ("3,0".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("2,0".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,0".equals(posNext)) {
                if ("1,0".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }else if ("2,0".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("2,1".equals(posActual)) { //1,1
            if ("2,0".equals(posNext) || "2,2".equals(posNext)) {
                if ("2,0".equals(posNext) && "Pared".equals(estado) || "2,2".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("2,1".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,1".equals(posNext)) {
                if ("3,1".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("2,1".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,1".equals(posNext)) {
                if ("1,1".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("2,1".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("2,2".equals(posActual)) { //1,2
            if ("2,1".equals(posNext) || "2,3".equals(posNext)) {
                if ("2,1".equals(posNext) && "Pared".equals(estado) || "2,3".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("2,2".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,2".equals(posNext)) {
                if ("3,2".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("2,2".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,2".equals(posNext)) {
                if ("1,2".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("2,2".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("2,3".equals(posActual)) { //1,3
            if ("2,2".equals(posNext) || "2,4".equals(posNext)) {
                if ("2,2".equals(posNext) && "Pared".equals(estado) || "2,4".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("2,3".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,3".equals(posNext)) {
                if ("3,3".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("2,3".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,3".equals(posNext)) {
                if ("1,3".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("2,3".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("2,4".equals(posActual)) { //1,4
            if ("2,3".equals(posNext) || "2,5".equals(posNext)) {
                if ("2,3".equals(posNext) && "Pared".equals(estado) || "2,5".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("2,4".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,4".equals(posNext)) {
                if ("3,4".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("2,4".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,4".equals(posNext)) {
                if ("1,4".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("2,4".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("2,5".equals(posActual)) { //1,4
            if ("2,4".equals(posNext) || "2,6".equals(posNext)) {
                if ("2,4".equals(posNext) && "Pared".equals(estado) || "2,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("2,5".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,5".equals(posNext)) {
                if ("3,5".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("2,5".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,5".equals(posNext)) {
                if ("1,5".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("2,5".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("2,6".equals(posActual)) { //1,4
            if ("2,5".equals(posNext) || "2,7".equals(posNext)) {
                if ("2,5".equals(posNext) && "Pared".equals(estado) || "2,7".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("2,6".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,6".equals(posNext)) {
                if ("3,6".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("2,6".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,6".equals(posNext)) {
                if ("1,6".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("2,6".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("2,7".equals(posActual)) { //1,4
            if ("2,6".equals(posNext)) {
                if ("2,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("2,7".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,7".equals(posNext)) {
                if ("3,7".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("2,7".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("1,7".equals(posNext)) {
                if ("1,7".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("2,7".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("3,0".equals(posActual)) {
            if ("3,1".equals(posNext)) {
                if ("3,1".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("3,0".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,0".equals(posNext)) {
                if ("4,0".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("3,0".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,0".equals(posNext)) {
                if ("2,0".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }else if ("3,0".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("3,1".equals(posActual)) { //1,1
            if ("3,0".equals(posNext) || "3,2".equals(posNext)) {
                if ("3,0".equals(posNext) && "Pared".equals(estado) || "3,2".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("3,1".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,1".equals(posNext)) {
                if ("4,1".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("3,1".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,1".equals(posNext)) {
                if ("2,1".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("3,1".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("3,2".equals(posActual)) { //1,2
            if ("3,1".equals(posNext) || "3,3".equals(posNext)) {
                if ("3,1".equals(posNext) && "Pared".equals(estado) || "3,3".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("3,2".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,2".equals(posNext)) {
                if ("4,2".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("3,2".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,2".equals(posNext)) {
                if ("2,2".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("3,2".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("3,3".equals(posActual)) { //1,3
            if ("3,2".equals(posNext) || "3,4".equals(posNext)) {
                if ("3,2".equals(posNext) && "Pared".equals(estado) || "3,4".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("3,3".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,3".equals(posNext)) {
                if ("4,3".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("3,3".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,3".equals(posNext)) {
                if ("2,3".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("3,3".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("3,4".equals(posActual)) { //1,4
            if ("3,3".equals(posNext) || "3,5".equals(posNext)) {
                if ("3,3".equals(posNext) && "Pared".equals(estado) || "3,5".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("3,4".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,4".equals(posNext)) {
                if ("4,4".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("3,4".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,4".equals(posNext)) {
                if ("2,4".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("3,4".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("3,5".equals(posActual)) { //1,4
            if ("3,4".equals(posNext) || "3,6".equals(posNext)) {
                if ("3,4".equals(posNext) && "Pared".equals(estado) || "3,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("3,5".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,5".equals(posNext)) {
                if ("4,5".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("3,5".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,5".equals(posNext)) {
                if ("2,5".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("3,5".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("3,6".equals(posActual)) { //1,4
            if ("3,5".equals(posNext) || "3,7".equals(posNext)) {
                if ("3,5".equals(posNext) && "Pared".equals(estado) || "3,7".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("3,6".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,6".equals(posNext)) {
                if ("4,6".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("3,6".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,6".equals(posNext)) {
                if ("2,6".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("3,6".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("3,7".equals(posActual)) { //1,4
            if ("3,6".equals(posNext)) {
                if ("3,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("3,7".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,7".equals(posNext)) {
                if ("4,7".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("3,7".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("2,7".equals(posNext)) {
                if ("2,7".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("3,7".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("4,0".equals(posActual)) {
            if ("4,1".equals(posNext)) {
                if ("4,1".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("4,0".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,0".equals(posNext)) {
                if ("5,0".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("4,0".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,0".equals(posNext)) {
                if ("3,0".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }else if ("4,0".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("4,1".equals(posActual)) { //1,1
            if ("4,0".equals(posNext) || "4,2".equals(posNext)) {
                if ("4,0".equals(posNext) && "Pared".equals(estado) || "4,2".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("4,1".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,1".equals(posNext)) {
                if ("5,1".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("4,1".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,1".equals(posNext)) {
                if ("3,1".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("4,1".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("4,2".equals(posActual)) { //1,2
            if ("4,1".equals(posNext) || "4,3".equals(posNext)) {
                if ("4,1".equals(posNext) && "Pared".equals(estado) || "4,3".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("4,2".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,2".equals(posNext)) {
                if ("5,2".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("4,2".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,2".equals(posNext)) {
                if ("3,2".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("4,2".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("4,3".equals(posActual)) { //1,3
            if ("4,2".equals(posNext) || "4,4".equals(posNext)) {
                if ("4,2".equals(posNext) && "Pared".equals(estado) || "4,4".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("4,3".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,3".equals(posNext)) {
                if ("5,3".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("4,3".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,3".equals(posNext)) {
                if ("3,3".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("4,3".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("4,4".equals(posActual)) { //1,4
            if ("4,3".equals(posNext) || "4,5".equals(posNext)) {
                if ("4,3".equals(posNext) && "Pared".equals(estado) || "4,5".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("4,4".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,4".equals(posNext)) {
                if ("5,4".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("4,4".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,4".equals(posNext)) {
                if ("3,4".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("4,4".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("4,5".equals(posActual)) { //1,4
            if ("4,4".equals(posNext) || "4,6".equals(posNext)) {
                if ("4,4".equals(posNext) && "Pared".equals(estado) || "4,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("4,5".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,5".equals(posNext)) {
                if ("5,5".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("4,5".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,5".equals(posNext)) {
                if ("3,5".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("4,5".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("4,6".equals(posActual)) { //1,4
            if ("4,5".equals(posNext) || "4,7".equals(posNext)) {
                if ("4,5".equals(posNext) && "Pared".equals(estado) || "4,7".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("4,6".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,6".equals(posNext)) {
                if ("5,6".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("4,6".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,6".equals(posNext)) {
                if ("3,6".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("4,6".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("4,7".equals(posActual)) { //1,4
            if ("4,6".equals(posNext)) {
                if ("4,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("4,7".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,7".equals(posNext)) {
                if ("5,7".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("4,7".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("3,7".equals(posNext)) {
                if ("3,7".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("4,7".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("5,0".equals(posActual)) {
            if ("5,1".equals(posNext)) {
                if ("5,1".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("5,0".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,0".equals(posNext)) {
                if ("6,0".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("5,0".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,0".equals(posNext)) {
                if ("4,0".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }else if ("5,0".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("5,1".equals(posActual)) { //1,1
            if ("5,0".equals(posNext) || "5,2".equals(posNext)) {
                if ("5,0".equals(posNext) && "Pared".equals(estado) || "5,2".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("5,1".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,1".equals(posNext)) {
                if ("6,1".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("5,1".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,1".equals(posNext)) {
                if ("4,1".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("5,1".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("5,2".equals(posActual)) { //1,2
            if ("5,1".equals(posNext) || "5,3".equals(posNext)) {
                if ("5,1".equals(posNext) && "Pared".equals(estado) || "5,3".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("5,2".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,2".equals(posNext)) {
                if ("6,2".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("5,2".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,2".equals(posNext)) {
                if ("4,2".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("5,2".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("5,3".equals(posActual)) { //1,3
            if ("5,2".equals(posNext) || "5,4".equals(posNext)) {
                if ("5,2".equals(posNext) && "Pared".equals(estado) || "5,4".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("5,3".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,3".equals(posNext)) {
                if ("6,3".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("5,3".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,3".equals(posNext)) {
                if ("4,3".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("5,3".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("5,4".equals(posActual)) { //1,4
            if ("5,3".equals(posNext) || "5,5".equals(posNext)) {
                if ("5,3".equals(posNext) && "Pared".equals(estado) || "5,5".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("5,4".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,4".equals(posNext)) {
                if ("6,4".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("5,4".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,4".equals(posNext)) {
                if ("4,4".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("5,4".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("5,5".equals(posActual)) { //1,4
            if ("5,4".equals(posNext) || "5,6".equals(posNext)) {
                if ("5,4".equals(posNext) && "Pared".equals(estado) || "5,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("5,5".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,5".equals(posNext)) {
                if ("6,5".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("5,5".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,5".equals(posNext)) {
                if ("4,5".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("5,5".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("5,6".equals(posActual)) { //1,4
            if ("5,5".equals(posNext) || "5,7".equals(posNext)) {
                if ("5,5".equals(posNext) && "Pared".equals(estado) || "5,7".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("5,6".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,6".equals(posNext)) {
                if ("6,6".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("5,6".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,6".equals(posNext)) {
                if ("4,6".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("5,6".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("5,7".equals(posActual)) { //1,4
            if ("5,6".equals(posNext)) {
                if ("5,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("5,7".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,7".equals(posNext)) {
                if ("6,7".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("5,7".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("4,7".equals(posNext)) {
                if ("4,7".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("5,7".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("6,0".equals(posActual)) {
            if ("6,1".equals(posNext)) {
                if ("6,1".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("6,0".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("7,0".equals(posNext)) {
                if ("7,0".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("6,0".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,0".equals(posNext)) {
                if ("5,0".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }else if ("6,0".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("6,1".equals(posActual)) { //1,1
            if ("6,0".equals(posNext) || "6,2".equals(posNext)) {
                if ("6,0".equals(posNext) && "Pared".equals(estado) || "6,2".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("6,1".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("7,1".equals(posNext)) {
                if ("7,1".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("6,1".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,1".equals(posNext)) {
                if ("5,1".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("6,1".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("6,2".equals(posActual)) { //1,2
            if ("6,1".equals(posNext) || "6,3".equals(posNext)) {
                if ("6,1".equals(posNext) && "Pared".equals(estado) || "6,3".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("6,2".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("7,2".equals(posNext)) {
                if ("7,2".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("6,2".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,2".equals(posNext)) {
                if ("5,2".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("6,2".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("6,3".equals(posActual)) { //1,3
            if ("6,2".equals(posNext) || "6,4".equals(posNext)) {
                if ("6,2".equals(posNext) && "Pared".equals(estado) || "6,4".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("6,3".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("7,3".equals(posNext)) {
                if ("7,3".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("7,3".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,3".equals(posNext)) {
                if ("5,3".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("6,3".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("6,4".equals(posActual)) { //1,4
            if ("6,3".equals(posNext) || "6,5".equals(posNext)) {
                if ("6,3".equals(posNext) && "Pared".equals(estado) || "6,5".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("6,4".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("7,4".equals(posNext)) {
                if ("7,4".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("6,4".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,4".equals(posNext)) {
                if ("5,4".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("6,4".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("6,5".equals(posActual)) { //1,4
            if ("6,4".equals(posNext) || "6,6".equals(posNext)) {
                if ("6,4".equals(posNext) && "Pared".equals(estado) || "5,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("6,5".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("7,5".equals(posNext)) {
                if ("7,5".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("6,5".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,5".equals(posNext)) {
                if ("5,5".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("6,5".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("6,6".equals(posActual)) { //1,4
            if ("6,5".equals(posNext) || "6,7".equals(posNext)) {
                if ("6,5".equals(posNext) && "Pared".equals(estado) || "6,7".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("6,6".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("7,6".equals(posNext)) {
                if ("7,6".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("6,6".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,6".equals(posNext)) {
                if ("5,6".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("6,6".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else if("6,7".equals(posActual)) { //1,4
            if ("6,6".equals(posNext)) {
                if ("6,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("6,7".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("7,7".equals(posNext)) {
                if ("7,7".equals(posNext) && "Techo".equals(estado)) {
                    return false;
                }  else if ("6,7".equals(posActual) && "Suelo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("5,7".equals(posNext)) {
                if ("5,7".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("6,7".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("7,0".equals(posActual)) {
            if ("7,1".equals(posNext)) {
                if ("7,1".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("7,0".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,0".equals(posNext)) {
                if ("6,0".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("7,0".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("7,1".equals(posActual)) {
            if ("7,0".equals(posNext) || "7,2".equals(posNext)) {
                if ("7,0".equals(posNext) && "Pared".equals(estado) || "7,2".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("7,1".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,1".equals(posNext)) {
                if ("6,1".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("7,1".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("7,2".equals(posActual)) {
            if ("7,1".equals(posNext) || "7,3".equals(posNext)) {
                if ("7,1".equals(posNext) && "Pared".equals(estado) || "7,3".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("7,2".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,2".equals(posNext)) {
                if ("6,2".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("7,2".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("7,3".equals(posActual)) {
            if ("7,2".equals(posNext) || "7,4".equals(posNext)) {
                if ("7,2".equals(posNext) && "Pared".equals(estado) || "7,4".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("7,3".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,3".equals(posNext)) {
                if ("6,3".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("7,3".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("7,4".equals(posActual)) {
            if ("7,3".equals(posNext) || "7,5".equals(posNext)) {
                if ("7,3".equals(posNext) && "Pared".equals(estado) || "7,5".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("7,4".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,4".equals(posNext)) {
                if ("6,4".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("7,4".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("7,5".equals(posActual)) {
            if ("7,4".equals(posNext) || "7,6".equals(posNext)) {
                if ("7,4".equals(posNext) && "Pared".equals(estado) || "7,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("7,5".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,5".equals(posNext)) {
                if ("6,5".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("7,5".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("7,6".equals(posActual)) {
            if ("7,5".equals(posNext) || "7,7".equals(posNext)) {
                if ("7,5".equals(posNext) && "Pared".equals(estado) || "7,7".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("7,6".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,6".equals(posNext)) {
                if ("6,6".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("7,6".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }else if ("7,7".equals(posActual)) {
            if ("7,6".equals(posNext)) {
                if ("7,6".equals(posNext) && "Pared".equals(estado)) {
                    return false;
                } else if ("7,7".equals(posActual) && "Pared".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else if("6,7".equals(posNext)) {
                if ("6,7".equals(posNext) && "Suelo".equals(estado)) {
                    return false;
                }  else if ("7,7".equals(posActual) && "Techo".equals(estado2)) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        
        
        return false;
    }
}