export class Report {
    reportId: number;
    reportType: string;
    reportDate: string;
    generatedBy: string;
    content: string;
  
  
    constructor(
      reportId: number = 0,
      reportType: string = '',
      reportDate: string = '',
      generatedBy: string = '',
      content: string = ''
    
    ) {
      this.reportId = reportId;
      this.reportType = reportType;
      this.reportDate = reportDate;
      this.generatedBy = generatedBy;
      this.content = content;
     
    }
  }
  