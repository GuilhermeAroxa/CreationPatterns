package com.example.demo.builder;


//2 Builder
//Cria objetos com muitos parâmetros
public class BuilderCourse {
	
	public static class Builder {
		private String title;
		private String subTitle;
		private String rate;
		private String author;
		private Boolean isPublic;	
		
		public Builder() {
			
		}
		
		public BuilderCourse build() {
			return new BuilderCourse(this);
		}

		public Builder title(String title) {
			this.title = title;
			return this;
		}
		
		public Builder subTitle(String subTitle) {
			this.subTitle = subTitle;
			return this;
		}
		
		public Builder rate(String rate) {
			this.rate = rate;
			return this;
		}
		
		public Builder author(String author) {
			this.author = author;
			return this;
		}
		
		public Builder isPublic(Boolean isPublic) {
			this.isPublic = isPublic;
			return this;
		}
	}
	
	private final String title;
	private final  String subTitle;
	private final  String rate;
	private final  String author;
	private final  Boolean isPublic;
	
	private BuilderCourse(Builder builder) {
		this.title = builder.title;
		this.subTitle = builder.subTitle;
		this.rate = builder.rate;
		this.author = builder.author;
		this.isPublic = builder.isPublic;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getSubTitle() {
		return subTitle;
	}
	
	public String getRate() {
		return rate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public Boolean getIsPublic() {
		return isPublic;
	}
	
}
