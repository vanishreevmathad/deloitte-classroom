package com.deloitte;

public class Assignment {

			
		
		int Id;
		private String name;
		private String showdate;
		private String showtime;
		private String status;
		
		
		public int getId() {
			return Id;
		}
		
		public void setId(int id) {
			Id = id;
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getShowdate() {
			return showdate;
		}
		
		public void setShowdate(String showdate) {
			this.showdate = showdate;
		}
		
		public String getShowtime() {
			return showtime;
		}
		
		public void setShowtime(String showtime) {
			this.showtime = showtime;
		}
		
		public String getStatus() {
			return status;
		}
		
		public void setStatus(String status) {
			this.status = status;
		}

		public Assignment(int id, String name, String showdate, String showtime, String status) {
			super();
			Id = id;
			this.name = name;
			this.showdate = showdate;
			this.showtime = showtime;
			this.status = status;
		}

}
