import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-administrarproductos`
 *
 * VistaAdministrarproductos element.
 *
 * @customElement
 * @polymer
 */
class VistaAdministrarproductos extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-administrarproductos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarproductos.is, VistaAdministrarproductos);
