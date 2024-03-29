package com.anggastudio.sample.WebApiSVEN.Parameters;

import static com.anggastudio.sample.WebApiSVEN.Parameters.RetrofitClient.getClient;

import com.anggastudio.sample.WebApiSVEN.Controllers.APIService;
import com.anggastudio.sample.WebApiSVEN.Models.CDia;
import com.anggastudio.sample.WebApiSVEN.Models.ClienteCredito;
import com.anggastudio.sample.WebApiSVEN.Models.ClientePrecio;
import com.anggastudio.sample.WebApiSVEN.Models.DetalleVenta;
import com.anggastudio.sample.WebApiSVEN.Models.LClientes;
import com.anggastudio.sample.WebApiSVEN.Models.Lados;
import com.anggastudio.sample.WebApiSVEN.Models.ListaComprobante;
import com.anggastudio.sample.WebApiSVEN.Models.Mangueras;
import com.anggastudio.sample.WebApiSVEN.Models.SettingTurno;
import com.anggastudio.sample.WebApiSVEN.Models.TipoPago;
import com.anggastudio.sample.WebApiSVEN.Models.VContometro;
import com.anggastudio.sample.WebApiSVEN.Models.VProducto;
import com.anggastudio.sample.WebApiSVEN.Models.VTipoPago;

import java.util.List;

public class GlobalInfo {

    /**
     * Tipo de tamaño papel
     */
    public  static String getTipoPapel10;

    /**
     * Variable de numero de copias impresión
     */
    public static Integer getNumeroVecesIMP10;


    /**
     * Variable de impresión para el Cierre X
     */
    public static String getTVolumenContometro10;
    public static String getTSProductosTotalGLL10;
    public static String getTSProductosTotalSoles10;
    public static String getTSProductosTotalDesc10;
    public static String getTSProductosTotalIncremento10;
    public static String getTotalPagosSoles10;
    public static String getTotalRTarjetasSoles10;
    public static String getMontoBruto10;

    /**
     * Datos lista de Clases
     */
    public  static List<Lados> getladosList10;
    public  static List<Mangueras> getmanguerasList10;
    public  static List<LClientes> getlclientesList10;
    public  static List<ClienteCredito> getlclientesCreditoList10;
    public  static List<TipoPago> gettipopagoList10;
    public  static List<DetalleVenta> getdetalleVentaList10;
    public  static List<SettingTurno> getsettingTurnoList10;
    public static  List<CDia>   getCDiaList10;
    public  static List<ListaComprobante>  getlistacomprobanteList10;
    public  static List<VContometro> getvContometroList10;
    public  static List<VProducto> getvProductoList10;
    public  static List<VTipoPago> getvTipoPagoList10;
    public static  List<ClientePrecio>  getclientePrecioList10;
    /**
     * Cliente precio
     */
    public static String getRfIdCPrecio10;
    public static String getClienteRZPrecio10;
    public static String getClienteIDPrecio10;
    public static String getNroPlacaPrecio10;
    public static String getArticuloIdPrecio10;
    public static String getTipClientePrecio10;
    public static String getTipoDescuentoPrecio10;
    public static Double getMontoDescuentoPrecio10;

    /**
     * Datos de la Empresa
     */
    public static String getNameCompany10;
    public static String getRucCompany10;
    public static String getAddressCompany10;
    public static String getBranchCompany10;
    public static String getPhoneCompany10;
    public static String getMailCompany10;
    public static String getManagerCompany10;
    public static String getSloganCompany10;

    /**
     * Datos del Usuario
     */
    public static String getuserID10;
    public static String getuserName10;
    public static String getuserPass10;
    public static String getuseridentFID10;
    public static Boolean getuserLocked10;
    public static Boolean getuserCancel10;

    /**
     * Datos del Usuario Anulacion
     */
    public static String getuserIDAnular10;
    public static String getuserNameAnular10;
    public static String getuserPassAnular10;
    public static Boolean getuserCancelAnular10;

    /**
     * Datos del Usuario Forzas Cambio
     */

    public static String getuserIDFE10;
    public static String getuserNameFE10;
    public static String getuserPassFE10;
    public static Boolean getuserCancelFE10;

    /**
     * Datos de los Lados y Mangueras
     */
    public static String getCara10;
    public static String getManguera10;

    /**
     * Datos de la Terminal
     */
    public static String  getterminalID10 = "";
    public static String  getterminalImei10;
    public static String  getterminalFecha10;
    public static Integer getterminalTurno10;
    public static Integer getterminalCompanyID10 = 1;
    public static Integer getterminalAlmacenID10;
    public static String  getterminalFechaHoraCierre10;
    public static boolean getterminalVentaPlaya10;
    public static boolean getterminalVentaTienda10;
    public static boolean getTerminalNameCompany10;
    public static Integer getTerminalImageW10;
    public static boolean getterminalCvariosPrinter10 = true;

    /**
     * Datos de la Setting
     */
    public static Integer getsettingCompanyId10;
    public static String  getsettingTituloApp10;
    public static String  getsettingFuelName10;
    public static String  getsettingFuelGrupoID10;
    public static Integer getsettingFuelLados10;
    public static Double  getsettingFuelMontoMinimo10;
    public static Integer getsettingImpuestoID110;
    public static Integer getsettingImpuestoValor110;
    public static Integer getsettingImpuestoID210;
    public static Integer getsettingImpuestoValor210;
    public static String  getsettingMonedaID10;
    public static String  getsettingMonedaValor10;
    public static String  getsettingClienteID10;
    public static String  getsettingClienteRZ10;
    public static String  getsettingNroPlaca10;
    public static Double  getsettingDNIMontoMinimo10;
    public static String  getsettingtimerAppVenta10;
    public static String  getsettingRutaLogo110;
    public static String  getsettingRutaLogo210;
    public static boolean getReporteVendedor10;
    public static boolean getReporteTarjetas10;
    public static boolean getVentasTipoPago10;
    public static boolean getVentasProductos10;
    public static boolean getVentasContometros10;

    /**
     * Datos del Cliente RUC-DNI
     */
    public static String  getclienteId10;
    public static String  getclienteRUC10;
    public static String  getclienteRZ10;
    public static String  getclienteDR10;
    public static Boolean getclienteConsulta_Sunat10;
    public static Integer getclienteDiasCredito10;
    public static String  getclienteTipoCliente10;

    /**
     * Datos de la Placa
     */
    public static String getNroPlaca10;
    public static String getplacaClienteID10;
    public static String getplacaClienteRZ10;
    public static String getplacaClienteDR10;



    /**
     * Datos de la Setting Task
     */
    public static String  getsettingtaskID10;
    public static String  getsettingtaskName10;
    public static Boolean getsettingtaskIsTask10;

    /**
     * Datos de la Optran
     */
    public static Boolean getpase10 = false;

    public static Integer  getoptranTranID10;
    public static String   getoptranNroLado10;
    public static String   getoptranManguera10;
    public static String   getoptranFechaTran10;
    public static String   getoptranArticuloID10;
    public static String   getoptranProductoDs10;
    public static Double   getoptranPrecio10;
    public static Double   getoptranGalones10;
    public static Double   getoptranSoles10;
    public static String   getoptranOperador10;
    public static String   getoptranCliente10;
    public static String   getoptranUniMed10;

    /**
     * Datos de la VentaCA
     */

    public static String  getventaca10;

    /**
     * Datos de la Correlativo
     */
    public static Boolean getpase11 = false;

    public static String  getcorrelativoTerminalID;
    public static String  getcorrelativoImei;
    public static String  getcorrelativoFecha;
    public static Integer getcorrelativoTurno;
    public static String  getcorrelativoSerie;
    public static String  getcorrelativoNumero;
    public static Double  getcorrelativoMDescuento;
    public static String  getcorrelativoDocumentoVenta;
    public static String  getcorrelativoTipoDesc;

    /**
     * Datos de la Cliente Sellecion
     */
    public static String  getclClienteID10;
    public static String getclClienteRUC10;
    public static String  getclClienteRZ10;
    public static String  getclClienteDR10;


    /**
     * Datos de Venta por Contometro
     */

    public static String  getvcontomFechaProceso10;
    public static Integer getvcontomTurno10;
    public static String getvcontomnRoLado10;
    public static String  getvcontomManguera10;
    public static String  getvcontomArticuloID10;
    public static String  getvcontomArticuloDS10;
    public static Double  getvcontomContomInicial10;
    public static Double  getvcontomContomFinal10;
    public static Double  getvcontomGalones10;
    public static Double  getvcontomPrecio10;
    public static Double  getvcontomSoles10;
    public static Double  getvcontomGalones101 = 0.00;


    /**
     * Datos del Descuento
     */

    public static Boolean getDescuentoPase = false;

    public static String  getdescuentoClienteID10;
    public static String  getdescuentoTipoID10;
    public static String  getdescuentoArticuloID10;
    public static Double  getdescuentoDescuento10;
    public static String  getdescuentoTipoDescuento10;
    public static String  getdescuentoTipoRango10;
    public static Double  getdescuentoRango110;
    public static Double  getdescuentoRango210;

    /**
     * Datos Consulta Venta
     */

    public static String  getconsultaventaFecha10;
    public static String  getconsultaventaTipoDocumentoID10;
    public static String  getconsultaventaSerieDocumento10;
    public static String  getconsultaventaNroDocumento10;
    public static String  getconsultaventaClienteID10;
    public static String  getconsultaventaClienteRZ10;
    public static Double  getconsultaventaMtoTotal10;
    public static String  getconsultaventaAnulado10;


    /**
     * Datos Reporte Anulados
     */

    public static Integer  getrAnuladosCantidad10;
    public static String   getrAnuladosSoles10;
    public static Integer  getrDespachosCantidad10;
    public static String   getrDespachosSoles10;
    public static String   getTotalRVenddorSoles10;

    /**
     * Setting Turno
     */

    public static Integer  getSettingCompanyId10;
    public static Integer  getSettingTurno10;
    public static Integer  getSettingRango110;
    public static Integer  getSettingRango210;

    public static String getnfcId10 = String.valueOf(-1);

    /**|
     * URL - APIService
     */

    //public static final String BASE_URL = "http://4-fact.com:8081/";
    //public static final String BASE_URL = "http://192.168.1.14:8081/";
    //public static final String BASE_URL = "http://192.168.1.20:8081/";
    //public static final String BASE_URL = "http://192.168.1.227:8081/";
    //public static final String BASE_URL = "http://192.168.1.245:8081/";
    //public static final String BASE_URL = "http://192.168.18.43:8081/";
    public static final String BASE_URL = "http://192.168.18.33:8081/";

    public static APIService getAPIService() {
        return getClient(BASE_URL).create(APIService.class);
    }

}
