package com.entity;

public class Specalist {
        private int id;
        private String specialName;
        
		public Specalist() {
			super();
			
		}
		public Specalist(int id, String specialName) {
			super();
			this.id = id;
			this.specialName = specialName;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSpecialistName() {
			return specialName;
		}
		public void setSpecialistName(String specialName) {
			this.specialName = specialName;
		}
        
}
