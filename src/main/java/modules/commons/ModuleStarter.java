package modules.commons;

import java.util.List;

public interface ModuleStarter {
	
	/**
	 * configuration keys are expected for the module to run
	 * @return List<String>
	 */
	public List<String> getConfigurable();
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
	 * @return List<String>
	 */
	public List<String> getSupportedCountry();
	public void setLogo(String logo);
	/**
	 * Base64 logo of the module
	 * @return String
	 */
	public String getLogo();

}
