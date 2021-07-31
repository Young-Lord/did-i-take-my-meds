/*
 * Did I Take My Meds? is a FOSS app to keep track of medications
 * Did I Take My Meds? is designed to help prevent a user from skipping doses and/or overdosing
 *     Copyright (C) 2021  Noah Stanford <noahstandingford@gmail.com>
 *
 *     Did I Take My Meds? is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Did I Take My Meds? is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package dev.corruptedark.diditakemymeds

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "medication")
data class Medication (@ColumnInfo(name = "name") var name: String,
                       @ColumnInfo(name = "hour") var hour: Int,
                       @ColumnInfo(name = "minute") var minute: Int,
                       @ColumnInfo(name = "description") var description: String,
                       @ColumnInfo(name = "startDay") var startDay: Int,
                       @ColumnInfo(name = "startMonth") var startMonth: Int,
                       @ColumnInfo(name = "startYear") var startYear: Int,
                       @ColumnInfo(name = "daysBetween") var daysBetween: Int = 1,
                       @ColumnInfo(name = "weeksBetween") var weeksBetween: Int = 0,
                       @ColumnInfo(name = "monthsBetween") var monthsBetween: Int = 0,
                       @ColumnInfo(name = "yearsBetween") var yearsBetween: Int = 0,
                       @ColumnInfo(name = "notify") var notify: Boolean = true) {

    @PrimaryKey(autoGenerate = true) var id: Long = 0
    @ColumnInfo(name = "dose_record") var doseRecord: ArrayList<DoseRecord> = ArrayList()
    @ColumnInfo(name = "moreDosesPerDay") var moreDosesPerDay: ArrayList<RepeatSchedule> = ArrayList()
}