
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Validacion {

    private String cadena;

    public Validacion() {

    }

    public Validacion(String cad) {
        cadena = cad;
    }

    //--------------------------------------------------------------------------
    public void establecer_cadena(String cad) {
        cadena = cad;
    }

    //--------------------------------------------------------------------------
    public boolean verificar_numero_letra() {
        if (cadena.matches("([0-9]+)|([0-9a-zA-Z]+)|([a-zA-Z]+)")) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------------------------------------------------------------
    public boolean verificar_entero() {
        if (cadena.matches("((\\-|\\+)?[0-9]+)")) {
            return true;
        } else {
            return false;
        }
    }
    public boolean verificar_entero_positivo() {
        if (cadena.matches("((\\+)?[1-9]+[0-9]*)")) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------------------------------------------------------------
    public boolean verificar_real() {
        if (verificar_entero()) {
            return true;
        } else if (cadena.matches("((\\-|\\+)?[0-9]+\\.[0-9]+)")) {
            return true;
        } else {
            return false;
        }
    }
    //--------------------------------------------------------------------------

    public boolean verificar_binario() {
        if (cadena.matches("(^[01]+$)|(^[01]+.[01]+$)")) {
            return true;
        } else {
            return false;
        }
    }
    //--------------------------------------------------------------------------

    public boolean verificar_fecha() {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(cadena);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    //--------------------------------------------------------------------------
    public boolean verificar_hexadecimal() {
        if (cadena.matches("(^[0-9A-F]+(.[0-9A-F]+)?$)")) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------------------------------------------------------------
    public boolean verificar_celular() {
        if (cadena.matches("^09[0-9]{8}$")) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------------------------------------------------------------
    public boolean verificar_telefono() {
        if (cadena.matches("(^0[2-7][2-6][0-9]{6}$)")) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------------------------------------------------------------
    public boolean verificar_espacio() {
        if (cadena.equals("") | cadena.equals("\n")) {
            return false;
        } else {
            if (cadena.matches("^([a-zA-Z0-9\\s]+)+[a-zA-Z0-9\\s]+[a-zA-Z0-9\\s]$")) {
                return true;
            } else {
                return false;
            }
        }

    }

    //--------------------------------------------------------------------------
    public boolean verificar_correo() {

        boolean veri;
        if (cadena.matches("(([A-Za-z0-9]+)@([A-Za-z0-9]+).(((org)|(io)|(ac)|(co)|(edu)|(go)|(or)|(fi)|(sa)|(tv)|(top)|(site)"
                + "|(com)|(info)|(click)|(net)|(biz))|((ac)|(ad)|(ae)|(af)|(ag)|(ai)|(al)|(am)|(an)|(ao)|(aq)|(ar)|"
                + "(as)|(at)|(au)|(aw)|(az)|(ba)|(bb)|(bd)|(be)|(bf)|(bg)|(bh)|(bi)|(bj)|(bm)|(bn)|(bo)|(br)|(bs)|(bt)|(bv)|"
                + "(bw)|(by)|(bz)|(ca)|(cc)|(cd)|(cf)|(cg)|(ch)|(ci)|(ck)|(cl)|(cm)|(cn)|(co)|(cr)|(cs)|(cu)|(cv)|(cx)|(cy)|"
                + "(cz)|(de)|(dj)|(dk)|(dm)|(do)|(dz)|(ec)|(ee)|(eg)|(eh)|(er)|(es)|(et)|(fi)|(fj)|(fk)|(fm)|(fo)|(fr)|(ga)|"
                + "(gb)|(gd)|(ge)|(gf)|(gg)|(gh)|(gi)|(gl)|(gm)|(gn)|(gp)|(gq)|(gr)|(gs)|(gt)|(gu)|(gw)|(gy)|(hk)|(hm)|(hn)|"
                + "(hr)|(ht)|(hu)|(id)|(ie)|(il)|(im)|(io)|(iq)|(ir)|(is)|(it)|(je)|(jm)|(jo)|(jp)|(ke)|(kg)|(kh)|(ki)|(km)|"
                + "(kn)|(kp)|(kr)|(kw)|(ky)|(kz)|(la)|(lb)|(lc)|(li)|(lk)|(lr)|(ls)|(lt)|(lu)|(lv)|(ly)|(ma)|(mc)|(md)|(mg)|"
                + "(mh)|(mk)|(ml)|(mm)|(mn)|(mo)|(mp)|(mq)|(mr)|(ms)|(mt)|(mu)|(mw)|(mx)|(my)|(mz)|(na)|(nc)|(ne)|(nf)|(ng)|"
                + "(ni)|(nl)|(no)|(np)|(nr)|(nu)|(nz)|(om)|(pa)|(pe)|(pe)|(pf)|(pg)|(ph)|(pk)|(pl)|(pm)|(pn)|(pr)|(ps)|(pt)|"
                + "(pw)|(py)|(qa)|(re)|(ro)|(ru)|(rw)|(sa)|(sb)|(sc)|(sd)|(se)|(sg)|(sh)|(si)|(sj)|(sk)|(sl)|(sm)|(sn)|(so)|"
                + "(sr)|(st)|(su)|(sv)|(sy)|(sz)|(tc)|(td)|(tf)|(tg)|(th)|(tj)|(tk)|(tm)|(tn)|(to)|(tp)|(tr)|(tt)|(tv)|(tw)|"
                + "(tz)|(ua)|(ug)|(uk)|(um)|(us)|(uy)|(uz)|(va)|(vc)|(ve)|(vg)|(vi)|(vn)|(vu)|(wf)|(ws)|(ye)|(yt)|(yu)|(za)|"
                + "(zm)|(zr)|(zw))).((ac)|(ad)|(ae)|(af)|(ag)|(ai)|(al)|(am)|(an)|(ao)|(aq)|(ar)|"
                + "(as)|(at)|(au)|(aw)|(az)|(ba)|(bb)|(bd)|(be)|(bf)|(bg)|(bh)|(bi)|(bj)|(bm)|(bn)|(bo)|(br)|(bs)|(bt)|(bv)|"
                + "(bw)|(by)|(bz)|(ca)|(cc)|(cd)|(cf)|(cg)|(ch)|(ci)|(ck)|(cl)|(cm)|(cn)|(co)|(cr)|(cs)|(cu)|(cv)|(cx)|(cy)|"
                + "(cz)|(de)|(dj)|(dk)|(dm)|(do)|(dz)|(ec)|(ee)|(eg)|(eh)|(er)|(es)|(et)|(fi)|(fj)|(fk)|(fm)|(fo)|(fr)|(ga)|"
                + "(gb)|(gd)|(ge)|(gf)|(gg)|(gh)|(gi)|(gl)|(gm)|(gn)|(gp)|(gq)|(gr)|(gs)|(gt)|(gu)|(gw)|(gy)|(hk)|(hm)|(hn)|"
                + "(hr)|(ht)|(hu)|(id)|(ie)|(il)|(im)|(io)|(iq)|(ir)|(is)|(it)|(je)|(jm)|(jo)|(jp)|(ke)|(kg)|(kh)|(ki)|(km)|"
                + "(kn)|(kp)|(kr)|(kw)|(ky)|(kz)|(la)|(lb)|(lc)|(li)|(lk)|(lr)|(ls)|(lt)|(lu)|(lv)|(ly)|(ma)|(mc)|(md)|(mg)|"
                + "(mh)|(mk)|(ml)|(mm)|(mn)|(mo)|(mp)|(mq)|(mr)|(ms)|(mt)|(mu)|(mw)|(mx)|(my)|(mz)|(na)|(nc)|(ne)|(nf)|(ng)|"
                + "(ni)|(nl)|(no)|(np)|(nr)|(nu)|(nz)|(om)|(pa)|(pe)|(pe)|(pf)|(pg)|(ph)|(pk)|(pl)|(pm)|(pn)|(pr)|(ps)|(pt)|"
                + "(pw)|(py)|(qa)|(re)|(ro)|(ru)|(rw)|(sa)|(sb)|(sc)|(sd)|(se)|(sg)|(sh)|(si)|(sj)|(sk)|(sl)|(sm)|(sn)|(so)|"
                + "(sr)|(st)|(su)|(sv)|(sy)|(sz)|(tc)|(td)|(tf)|(tg)|(th)|(tj)|(tk)|(tm)|(tn)|(to)|(tp)|(tr)|(tt)|(tv)|(tw)|"
                + "(tz)|(ua)|(ug)|(uk)|(um)|(us)|(uy)|(uz)|(va)|(vc)|(ve)|(vg)|(vi)|(vn)|(vu)|(wf)|(ws)|(ye)|(yt)|(yu)|(za)|"
                + "(zm)|(zr)|(zw)))|(([A-Za-z0-9]+)@([A-Za-z0-9]+).(((org)|(io)|(ac)|(co)|(edu)|(go)|(or)|(fi)|(sa)|(tv)|(top)|(site)"
                + "|(com)|(info)|(click)|(net)|(biz)|(es)))"
                + "|((ac)|(ad)|(ae)|(af)|(ag)|(ai)|(al)|(am)|(an)|(ao)|(aq)|(ar)|"
                + "(as)|(at)|(au)|(aw)|(az)|(ba)|(bb)|(bd)|(be)|(bf)|(bg)|(bh)|(bi)|(bj)|(bm)|(bn)|(bo)|(br)|(bs)|(bt)|(bv)|"
                + "(bw)|(by)|(bz)|(ca)|(cc)|(cd)|(cf)|(cg)|(ch)|(ci)|(ck)|(cl)|(cm)|(cn)|(co)|(cr)|(cs)|(cu)|(cv)|(cx)|(cy)|"
                + "(cz)|(de)|(dj)|(dk)|(dm)|(do)|(dz)|(ec)|(ee)|(eg)|(eh)|(er)|(es)|(et)|(fi)|(fj)|(fk)|(fm)|(fo)|(fr)|(ga)|"
                + "(gb)|(gd)|(ge)|(gf)|(gg)|(gh)|(gi)|(gl)|(gm)|(gn)|(gp)|(gq)|(gr)|(gs)|(gt)|(gu)|(gw)|(gy)|(hk)|(hm)|(hn)|"
                + "(hr)|(ht)|(hu)|(id)|(ie)|(il)|(im)|(io)|(iq)|(ir)|(is)|(it)|(je)|(jm)|(jo)|(jp)|(ke)|(kg)|(kh)|(ki)|(km)|"
                + "(kn)|(kp)|(kr)|(kw)|(ky)|(kz)|(la)|(lb)|(lc)|(li)|(lk)|(lr)|(ls)|(lt)|(lu)|(lv)|(ly)|(ma)|(mc)|(md)|(mg)|"
                + "(mh)|(mk)|(ml)|(mm)|(mn)|(mo)|(mp)|(mq)|(mr)|(ms)|(mt)|(mu)|(mw)|(mx)|(my)|(mz)|(na)|(nc)|(ne)|(nf)|(ng)|"
                + "(ni)|(nl)|(no)|(np)|(nr)|(nu)|(nz)|(om)|(pa)|(pe)|(pe)|(pf)|(pg)|(ph)|(pk)|(pl)|(pm)|(pn)|(pr)|(ps)|(pt)|"
                + "(pw)|(py)|(qa)|(re)|(ro)|(ru)|(rw)|(sa)|(sb)|(sc)|(sd)|(se)|(sg)|(sh)|(si)|(sj)|(sk)|(sl)|(sm)|(sn)|(so)|"
                + "(sr)|(st)|(su)|(sv)|(sy)|(sz)|(tc)|(td)|(tf)|(tg)|(th)|(tj)|(tk)|(tm)|(tn)|(to)|(tp)|(tr)|(tt)|(tv)|(tw)|"
                + "(tz)|(ua)|(ug)|(uk)|(um)|(us)|(uy)|(uz)|(va)|(vc)|(ve)|(vg)|(vi)|(vn)|(vu)|(wf)|(ws)|(ye)|(yt)|(yu)|(za)|"
                + "(zm)|(zr)|(zw)))|(([A-Za-z0-9]+)@([A-Za-z0-9]+).(((org)|(uazuay)|(io)|(ac)|(co)|(edu)|(go)|(or)|(fi)|(sa)|(tv)|(top)|(site)"
                + "|(com)|(info)|(click)|(net)|(biz))|((ac)|(ad)|(ae)|(af)|(ag)|(ai)|(al)|(am)|(an)|(ao)|(aq)|(ar)|"
                + "(as)|(at)|(au)|(aw)|(az)|(ba)|(bb)|(bd)|(be)|(bf)|(bg)|(bh)|(bi)|(bj)|(bm)|(bn)|(bo)|(br)|(bs)|(bt)|(bv)|"
                + "(bw)|(by)|(bz)|(ca)|(cc)|(cd)|(cf)|(cg)|(ch)|(ci)|(ck)|(cl)|(cm)|(cn)|(co)|(cr)|(cs)|(cu)|(cv)|(cx)|(cy)|"
                + "(cz)|(de)|(dj)|(dk)|(dm)|(do)|(dz)|(ec)|(ee)|(eg)|(eh)|(er)|(es)|(et)|(fi)|(fj)|(fk)|(fm)|(fo)|(fr)|(ga)|"
                + "(gb)|(gd)|(ge)|(gf)|(gg)|(gh)|(gi)|(gl)|(gm)|(gn)|(gp)|(gq)|(gr)|(gs)|(gt)|(gu)|(gw)|(gy)|(hk)|(hm)|(hn)|"
                + "(hr)|(ht)|(hu)|(id)|(ie)|(il)|(im)|(io)|(iq)|(ir)|(is)|(it)|(je)|(jm)|(jo)|(jp)|(ke)|(kg)|(kh)|(ki)|(km)|"
                + "(kn)|(kp)|(kr)|(kw)|(ky)|(kz)|(la)|(lb)|(lc)|(li)|(lk)|(lr)|(ls)|(lt)|(lu)|(lv)|(ly)|(ma)|(mc)|(md)|(mg)|"
                + "(mh)|(mk)|(ml)|(mm)|(mn)|(mo)|(mp)|(mq)|(mr)|(ms)|(mt)|(mu)|(mw)|(mx)|(my)|(mz)|(na)|(nc)|(ne)|(nf)|(ng)|"
                + "(ni)|(nl)|(no)|(np)|(nr)|(nu)|(nz)|(om)|(pa)|(pe)|(pe)|(pf)|(pg)|(ph)|(pk)|(pl)|(pm)|(pn)|(pr)|(ps)|(pt)|"
                + "(pw)|(py)|(qa)|(re)|(ro)|(ru)|(rw)|(sa)|(sb)|(sc)|(sd)|(se)|(sg)|(sh)|(si)|(sj)|(sk)|(sl)|(sm)|(sn)|(so)|"
                + "(sr)|(st)|(su)|(sv)|(sy)|(sz)|(tc)|(td)|(tf)|(tg)|(th)|(tj)|(tk)|(tm)|(tn)|(to)|(tp)|(tr)|(tt)|(tv)|(tw)|"
                + "(tz)|(ua)|(ug)|(uk)|(um)|(us)|(uy)|(uz)|(va)|(vc)|(ve)|(vg)|(vi)|(vn)|(vu)|(wf)|(ws)|(ye)|(yt)|(yu)|(za)|"
                + "(zm)|(zr)|(zw))).(((org)|(uazuay)|(io)|(ac)|(co)|(edu)|(go)|(or)|(fi)|(sa)|(tv)|(top)|(site)"
                + "|(com)|(info)|(click)|(net)|(biz))|((ac)|(ad)|(ae)|(af)|(ag)|(ai)|(al)|(am)|(an)|(ao)|(aq)|(ar)|"
                + "(as)|(at)|(au)|(aw)|(az)|(ba)|(bb)|(bd)|(be)|(bf)|(bg)|(bh)|(bi)|(bj)|(bm)|(bn)|(bo)|(br)|(bs)|(bt)|(bv)|"
                + "(bw)|(by)|(bz)|(ca)|(cc)|(cd)|(cf)|(cg)|(ch)|(ci)|(ck)|(cl)|(cm)|(cn)|(co)|(cr)|(cs)|(cu)|(cv)|(cx)|(cy)|"
                + "(cz)|(de)|(dj)|(dk)|(dm)|(do)|(dz)|(ec)|(ee)|(eg)|(eh)|(er)|(es)|(et)|(fi)|(fj)|(fk)|(fm)|(fo)|(fr)|(ga)|"
                + "(gb)|(gd)|(ge)|(gf)|(gg)|(gh)|(gi)|(gl)|(gm)|(gn)|(gp)|(gq)|(gr)|(gs)|(gt)|(gu)|(gw)|(gy)|(hk)|(hm)|(hn)|"
                + "(hr)|(ht)|(hu)|(id)|(ie)|(il)|(im)|(io)|(iq)|(ir)|(is)|(it)|(je)|(jm)|(jo)|(jp)|(ke)|(kg)|(kh)|(ki)|(km)|"
                + "(kn)|(kp)|(kr)|(kw)|(ky)|(kz)|(la)|(lb)|(lc)|(li)|(lk)|(lr)|(ls)|(lt)|(lu)|(lv)|(ly)|(ma)|(mc)|(md)|(mg)|"
                + "(mh)|(mk)|(ml)|(mm)|(mn)|(mo)|(mp)|(mq)|(mr)|(ms)|(mt)|(mu)|(mw)|(mx)|(my)|(mz)|(na)|(nc)|(ne)|(nf)|(ng)|"
                + "(ni)|(nl)|(no)|(np)|(nr)|(nu)|(nz)|(om)|(pa)|(pe)|(pe)|(pf)|(pg)|(ph)|(pk)|(pl)|(pm)|(pn)|(pr)|(ps)|(pt)|"
                + "(pw)|(py)|(qa)|(re)|(ro)|(ru)|(rw)|(sa)|(sb)|(sc)|(sd)|(se)|(sg)|(sh)|(si)|(sj)|(sk)|(sl)|(sm)|(sn)|(so)|"
                + "(sr)|(st)|(su)|(sv)|(sy)|(sz)|(tc)|(td)|(tf)|(tg)|(th)|(tj)|(tk)|(tm)|(tn)|(to)|(tp)|(tr)|(tt)|(tv)|(tw)|"
                + "(tz)|(ua)|(ug)|(uk)|(um)|(us)|(uy)|(uz)|(va)|(vc)|(ve)|(vg)|(vi)|(vn)|(vu)|(wf)|(ws)|(ye)|(yt)|(yu)|(za)|"
                + "(zm)|(zr)|(zw))).((ac)|(ad)|(ae)|(af)|(ag)|(ai)|(al)|(am)|(an)|(ao)|(aq)|(ar)|"
                + "(as)|(at)|(au)|(aw)|(az)|(ba)|(bb)|(bd)|(be)|(bf)|(bg)|(bh)|(bi)|(bj)|(bm)|(bn)|(bo)|(br)|(bs)|(bt)|(bv)|"
                + "(bw)|(by)|(bz)|(ca)|(cc)|(cd)|(cf)|(cg)|(ch)|(ci)|(ck)|(cl)|(cm)|(cn)|(co)|(cr)|(cs)|(cu)|(cv)|(cx)|(cy)|"
                + "(cz)|(de)|(dj)|(dk)|(dm)|(do)|(dz)|(ec)|(ee)|(eg)|(eh)|(er)|(es)|(et)|(fi)|(fj)|(fk)|(fm)|(fo)|(fr)|(ga)|"
                + "(gb)|(gd)|(ge)|(gf)|(gg)|(gh)|(gi)|(gl)|(gm)|(gn)|(gp)|(gq)|(gr)|(gs)|(gt)|(gu)|(gw)|(gy)|(hk)|(hm)|(hn)|"
                + "(hr)|(ht)|(hu)|(id)|(ie)|(il)|(im)|(io)|(iq)|(ir)|(is)|(it)|(je)|(jm)|(jo)|(jp)|(ke)|(kg)|(kh)|(ki)|(km)|"
                + "(kn)|(kp)|(kr)|(kw)|(ky)|(kz)|(la)|(lb)|(lc)|(li)|(lk)|(lr)|(ls)|(lt)|(lu)|(lv)|(ly)|(ma)|(mc)|(md)|(mg)|"
                + "(mh)|(mk)|(ml)|(mm)|(mn)|(mo)|(mp)|(mq)|(mr)|(ms)|(mt)|(mu)|(mw)|(mx)|(my)|(mz)|(na)|(nc)|(ne)|(nf)|(ng)|"
                + "(ni)|(nl)|(no)|(np)|(nr)|(nu)|(nz)|(om)|(pa)|(pe)|(pe)|(pf)|(pg)|(ph)|(pk)|(pl)|(pm)|(pn)|(pr)|(ps)|(pt)|"
                + "(pw)|(py)|(qa)|(re)|(ro)|(ru)|(rw)|(sa)|(sb)|(sc)|(sd)|(se)|(sg)|(sh)|(si)|(sj)|(sk)|(sl)|(sm)|(sn)|(so)|"
                + "(sr)|(st)|(su)|(sv)|(sy)|(sz)|(tc)|(td)|(tf)|(tg)|(th)|(tj)|(tk)|(tm)|(tn)|(to)|(tp)|(tr)|(tt)|(tv)|(tw)|"
                + "(tz)|(ua)|(ug)|(uk)|(um)|(us)|(uy)|(uz)|(va)|(vc)|(ve)|(vg)|(vi)|(vn)|(vu)|(wf)|(ws)|(ye)|(yt)|(yu)|(za)|"
                + "(zm)|(zr)|(zw)))")) {
            veri = true;
        } else {
            veri = false;
        }
        return veri;
    }

    //--------------------------------------------------------------------------
    public boolean verificar_direccion() {

        if (cadena.matches("([A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\s[1-9][0-9]?-[1]?[1-3]?[0-9])|([A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\s[1-9][0-9]?-[1]?[1-3]?[0-9]\\sy\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+)|([A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\sS/N)|([A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\.?\\s([a-z-ñáéíóú]+\\s)*[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\sy\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+(\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+)*)|(([A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+)\\s[1-9][0-9]?-[1-9][0-9]*\\sy\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+(\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+)*)|(([A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\s([A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]\\s)?([1-9][0-9]?\\-[1-9]+)?y\\s([A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\s([A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]\\s))))")) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------------------------------------------------------------
    public boolean verificar_nombre() {
        return cadena.matches("[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+\\s[A-Z-ÑÁÉÍÓÚ][a-z-ñáéíóú]+|[A-Z-ÑÁÉÍÓÚ][a-z-ñ]+");
    }
    
    public boolean verificar_sistema_monetario() {
        return cadena.matches("[1-9][0-9]*(\\,[1-9][0-9]*)*");
    }
    
    public boolean verificar_hora() {
        return cadena.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}");
    }

    //--------------------------------------------------------------------------
    public boolean verificar_cedula() {
        boolean veri = false;
        switch (cadena.length()) {
            case 10:
                int cedula[] = new int[10];
                int sum = 0,
                 res;
                int arreglo[] = new int[10];
                for (int i = 0; i < 10; i++) {
                    cedula[i] = Integer.parseInt(cadena.substring(i, i + 1));
                }
                for (int i = 0; i < 9; i = i + 2) {
                    arreglo[i] = cedula[i] * 2;
                    if (arreglo[i] > 9) {
                        arreglo[i] = arreglo[i] - 9;
                    }
                }
                for (int i = 1; i < 8; i = i + 2) {
                    arreglo[i] = cedula[i];
                }
                for (int i = 0; i < 9; i++) {
                    sum = sum + arreglo[i];
                }
                res = sum % 10;
                if (res == 0) {
                    if (0 == cedula[9]) {
                        veri = true;
                    }
                } else {
                    res = 10 - res;
                    if (res == cedula[9]) {
                        veri = true;
                    } else {
                        veri = false;
                    }
                }
                break;
            case 13:
                String mensaje = ("ruc");
                int ruc[] = new int[13];
                for (int i = 0; i < 13; i++) {
                    ruc[i] = Integer.parseInt(cadena.substring(i, i + 1));
                }
                switch (ruc[2]) {
                    case 6:
                        if ((ruc[12] > 0) && (ruc[11] == 0) && (ruc[10] == 0) && (ruc[9] == 0)) {
                            veri = rucpublico(ruc);
                        }

                        break;

                    case 9:
                        if ((ruc[12] > 0) && (ruc[11] == 0) && (ruc[10] == 0)) {
                            veri = rucpjuridica(ruc);
                        }

                        break;
                    default:
                        cadena = cadena.substring(0, cadena.length() - 3);
                        veri = verificar_cedula();
                        break;
                }
                break;
            default:
                veri = false;
                break;
        }
        return veri;
    }

    public static boolean rucpublico(int ruc[]) {
        boolean veri = false;
        int sum = 0, res;
        int arreglo[] = new int[13];
        arreglo[0] = ruc[0] * 3;
        arreglo[1] = ruc[1] * 2;
        arreglo[2] = ruc[2] * 7;
        arreglo[3] = ruc[3] * 6;
        arreglo[4] = ruc[4] * 5;
        arreglo[5] = ruc[5] * 4;
        arreglo[6] = ruc[6] * 3;
        arreglo[7] = ruc[7] * 2;
        for (int i = 0; i < 9; i++) {
            sum = sum + arreglo[i];
        }
        res = sum % 11;
        if (res == 0) {
            if (0 == ruc[8]) {
                veri = true;
            }
        } else {
            res = 11 - res;
            if (res == ruc[8]) {
                veri = true;
            } else {
                veri = false;
            }
        }
        return veri;
    }

    public static boolean rucpjuridica(int ruc[]) {
        int sum = 0, res;
        boolean veri = false;
        int arreglo[] = new int[13];
        arreglo[0] = ruc[0] * 4;
        arreglo[1] = ruc[1] * 3;
        arreglo[2] = ruc[2] * 2;
        arreglo[3] = ruc[3] * 7;
        arreglo[4] = ruc[4] * 6;
        arreglo[5] = ruc[5] * 5;
        arreglo[6] = ruc[6] * 4;
        arreglo[7] = ruc[7] * 3;
        arreglo[8] = ruc[8] * 2;
        for (int i = 0; i < 10; i++) {
            sum = sum + arreglo[i];
        }
        res = sum % 11;

        if (res == 0) {
            if (0 == ruc[9]) {
                veri = true;
            }
        } else {
            res = 11 - res;
            if (res == ruc[9]) {
                veri = true;
            } else {
                veri = false;
            }
        }
        return veri;
    }
}
