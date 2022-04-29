package modules.commons;

import java.util.List;

public interface ModuleStarter {
	
	/**
	 * configuration (json serialized to String)
	 * @return
	 */
	public String getConfigurable();
	public void setConfigurable(String config);
	/**
	 * Unique module code
	 * @return String
	 */
	public String getUniqueCode();
	public void setUniqueCode(String uniqueCode);
	public void setModuleType(ModuleType moduleType);
	/**
	 * Payment or Shipping
	 * @return ModuleType
	 */
	public ModuleType getModuleType();
	public void setSupportedCountry(List<String> supportedCountry);
	/**
	 * All country supported by this module
	 * @return
	 */
	public List<String> getSupportedCountry();
	public void setLogo(String logo);
	/**
	 * Base64 logo of the module
	 * @return String
	 */
	public String getLogo();

}
