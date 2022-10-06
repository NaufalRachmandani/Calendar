package com.kizitonwose.calendarview.internal.weekcalendar

import com.kizitonwose.calendarview.WeekCalendarView
import com.kizitonwose.calendarview.internal.CalendarLayoutManager
import com.kizitonwose.calendarview.internal.MarginValues
import java.time.LocalDate

internal class WeekCalendarLayoutManager(private val calView: WeekCalendarView) :
    CalendarLayoutManager<LocalDate, LocalDate>(calView, HORIZONTAL) {

    private val adapter: WeekCalendarAdapter
        get() = calView.adapter as WeekCalendarAdapter

    override fun getaItemAdapterPosition(data: LocalDate): Int = adapter.getAdapterPosition(data)
    override fun getaDayAdapterPosition(data: LocalDate): Int = adapter.getAdapterPosition(data)
    override fun getItemMargins(): MarginValues = calView.weekMargins
    override fun scrollPaged(): Boolean = calView.scrollPaged
    override fun notifyScrollListenerIfNeeded() = adapter.notifyWeekScrollListenerIfNeeded()
}
