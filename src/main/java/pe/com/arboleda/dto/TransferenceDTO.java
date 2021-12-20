package pe.com.arboleda.dto;

public class TransferenceDTO {
  private String sourceAccountNumber;
  private String destinyAccountNumber;
  private Double transferAmount;
  private Integer secretKey;
  
  public TransferenceDTO(String sourceAccountNumber, String destinyAccountNumber, Double transferAmount, Integer secretKey) {
    this.sourceAccountNumber = sourceAccountNumber;
    this.destinyAccountNumber = destinyAccountNumber;
    this.transferAmount = transferAmount;
    this.secretKey = secretKey;
  }

  public String getSourceAccountNumber() {
    return sourceAccountNumber;
  }

  public void setSourceAccountNumber(String sourceAccountNumber) {
    this.sourceAccountNumber = sourceAccountNumber;
  }

  public String getDestinyAccountNumber() {
    return destinyAccountNumber;
  }

  public void setDestinyAccountNumber(String destinyAccountNumber) {
    this.destinyAccountNumber = destinyAccountNumber;
  }

  public Double getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(Double transferAmount) {
    this.transferAmount = transferAmount;
  }

  public Integer getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(Integer secretKey) {
    this.secretKey = secretKey;
  }

}
