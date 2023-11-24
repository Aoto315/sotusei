import { Calendar } from '@fullcalendar/core';
import interactionPlugin from '@fullcalendar/interaction'; // for selectable
import dayGridPlugin from '@fullcalendar/daygrid'; // for dayGridMonth view

let calendar = new Calendar(calendarEl, {
  plugins: [ interactionPlugin, dayGridPlugin ],
  initialView: 'dayGridMonth',
  selectable: true
});