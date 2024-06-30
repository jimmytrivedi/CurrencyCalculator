package jimmytrivedi.`in`.currencycalculator.networking.data.exchangerate

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Data(
    var AUD: Double?,
    var BGN: Double?,
    var BRL: Double?,
    var CAD: Double?,
    var CHF: Double?,
    var CNY: Double?,
    var CZK: Double?,
    var DKK: Double?,
    var EUR: Double?,
    var GBP: Double?,
    var HKD: Double?,
    var HRK: Double?,
    var HUF: Double?,
    var IDR: Double?,
    var ILS: Double?,
    var INR: Double?,
    var ISK: Double?,
    var JPY: Double?,
    var KRW: Double?,
    var MXN: Double?,
    var MYR: Double?,
    var NOK: Double?,
    var NZD: Double?,
    var PHP: Double?,
    var PLN: Double?,
    var RON: Double?,
    var RUB: Double?,
    var SEK: Double?,
    var SGD: Double?,
    var THB: Double?,
    var TRY: Double?,
    var USD: Double?,
    var ZAR: Double?,
    var result: String?
) : Parcelable